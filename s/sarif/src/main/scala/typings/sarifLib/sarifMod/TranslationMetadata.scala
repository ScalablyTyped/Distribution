package typings
package sarifLib.sarifMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TranslationMetadata extends js.Object {
  /**
    * The absolute URI from which the translation metadata can be downloaded.
    */
  var downloadUri: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A comprehensive description of the translation metadata.
    */
  var fullDescription: js.UndefOr[MultiformatMessageString] = js.undefined
  /**
    * The full name associated with the translation metadata.
    */
  var fullName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The absolute URI from which information related to the translation metadata can be downloaded.
    */
  var informationUri: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The name associated with the translation metadata.
    */
  var name: java.lang.String
  /**
    * Key/value pairs that provide additional information about the translation metadata.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
  /**
    * A brief description of the translation metadata.
    */
  var shortDescription: js.UndefOr[MultiformatMessageString] = js.undefined
}

object TranslationMetadata {
  @scala.inline
  def apply(
    name: java.lang.String,
    downloadUri: java.lang.String = null,
    fullDescription: MultiformatMessageString = null,
    fullName: java.lang.String = null,
    informationUri: java.lang.String = null,
    properties: PropertyBag = null,
    shortDescription: MultiformatMessageString = null
  ): TranslationMetadata = {
    val __obj = js.Dynamic.literal(name = name)
    if (downloadUri != null) __obj.updateDynamic("downloadUri")(downloadUri)
    if (fullDescription != null) __obj.updateDynamic("fullDescription")(fullDescription)
    if (fullName != null) __obj.updateDynamic("fullName")(fullName)
    if (informationUri != null) __obj.updateDynamic("informationUri")(informationUri)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (shortDescription != null) __obj.updateDynamic("shortDescription")(shortDescription)
    __obj.asInstanceOf[TranslationMetadata]
  }
}

