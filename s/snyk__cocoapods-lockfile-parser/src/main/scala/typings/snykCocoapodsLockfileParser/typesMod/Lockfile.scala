package typings.snykCocoapodsLockfileParser.typesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Lockfile extends js.Object {
  var `CHECKOUT OPTIONS`: js.UndefOr[StringDictionary[CheckoutOptions]] = js.undefined
  var COCOAPODS: js.UndefOr[String] = js.undefined
  var DEPENDENCIES: js.Array[String]
  var `EXTERNAL SOURCES`: js.UndefOr[StringDictionary[ExternalSourceInfo]] = js.undefined
  var `PODFILE CHECKSUM`: js.UndefOr[String] = js.undefined
  var PODS: js.Array[PodEntry]
  var `SPEC CHECKSUMS`: StringDictionary[String]
  var `SPEC REPOS`: js.UndefOr[StringDictionary[js.Array[String]]] = js.undefined
}

object Lockfile {
  @scala.inline
  def apply(
    DEPENDENCIES: js.Array[String],
    PODS: js.Array[PodEntry],
    `SPEC CHECKSUMS`: StringDictionary[String],
    `CHECKOUT OPTIONS`: StringDictionary[CheckoutOptions] = null,
    COCOAPODS: String = null,
    `EXTERNAL SOURCES`: StringDictionary[ExternalSourceInfo] = null,
    `PODFILE CHECKSUM`: String = null,
    `SPEC REPOS`: StringDictionary[js.Array[String]] = null
  ): Lockfile = {
    val __obj = js.Dynamic.literal(DEPENDENCIES = DEPENDENCIES.asInstanceOf[js.Any], PODS = PODS.asInstanceOf[js.Any])
    __obj.updateDynamic("SPEC CHECKSUMS")((`SPEC CHECKSUMS`).asInstanceOf[js.Any])
    if (`CHECKOUT OPTIONS` != null) __obj.updateDynamic("CHECKOUT OPTIONS")((`CHECKOUT OPTIONS`).asInstanceOf[js.Any])
    if (COCOAPODS != null) __obj.updateDynamic("COCOAPODS")(COCOAPODS.asInstanceOf[js.Any])
    if (`EXTERNAL SOURCES` != null) __obj.updateDynamic("EXTERNAL SOURCES")((`EXTERNAL SOURCES`).asInstanceOf[js.Any])
    if (`PODFILE CHECKSUM` != null) __obj.updateDynamic("PODFILE CHECKSUM")((`PODFILE CHECKSUM`).asInstanceOf[js.Any])
    if (`SPEC REPOS` != null) __obj.updateDynamic("SPEC REPOS")((`SPEC REPOS`).asInstanceOf[js.Any])
    __obj.asInstanceOf[Lockfile]
  }
}

