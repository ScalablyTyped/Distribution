package typings.rsocketDashCore.wellKnownMimeTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rsocket-core/WellKnownMimeType", JSImport.Default)
@js.native
class default protected () extends WellKnownMimeType {
  def this(str: String, identifier: Double) = this()
  /** @return the byte identifier of the mime type, guaranteed to be positive or zero. */
  /* CompleteClass */
  override val identifier: Double = js.native
  /**
    * @return the mime type represented as a {@link String}, which is made of US_ASCII compatible
    *     characters only
    */
  /* CompleteClass */
  override val string: String = js.native
}

/* static members */
@JSImport("rsocket-core/WellKnownMimeType", JSImport.Default)
@js.native
object default extends js.Object {
  /**
    * Find the {@link WellKnownMimeType} for the given identifier (as an {@code int}). Valid
    * identifiers are defined to be integers between 0 and 127, inclusive. Identifiers outside of
    * this range will produce the {@link #UNPARSEABLE_MIME_TYPE}. Additionally, some identifiers in
    * that range are still only reserved and don't have a type associated yet: this method returns
    * the {@link #UNKNOWN_RESERVED_MIME_TYPE} when passing such an identifier, which lets call sites
    * potentially detect this and keep the original representation when transmitting the associated
    * metadata buffer.
    *
    * @param id the looked up identifier
    * @return the {@link WellKnownMimeType}, or {@link #UNKNOWN_RESERVED_MIME_TYPE} if the id is out
    *     of the specification's range, or {@link #UNKNOWN_RESERVED_MIME_TYPE} if the id is one that
    *     is merely reserved but unknown to this implementation.
    */
  def fromIdentifier(id: Double): WellKnownMimeType = js.native
  /**
    * Find the {@link WellKnownMimeType} for the given {@link String} representation. If the
    * representation is {@code null} or doesn't match a {@link WellKnownMimeType}, the {@link
    * #UNPARSEABLE_MIME_TYPE} is returned.
    *
    * @param mimeType the looked up mime type
    * @return the matching {@link WellKnownMimeType}, or {@link #UNPARSEABLE_MIME_TYPE} if none matches
    */
  def fromString(mimeType: String): WellKnownMimeType = js.native
}

