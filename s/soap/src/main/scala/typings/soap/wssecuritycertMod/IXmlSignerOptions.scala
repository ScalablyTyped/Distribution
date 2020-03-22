package typings.soap.wssecuritycertMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IXmlSignerOptions extends js.Object {
  var attrs: js.UndefOr[StringDictionary[String]] = js.undefined
  var existingPrefixes: js.UndefOr[StringDictionary[String]] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
}

object IXmlSignerOptions {
  @scala.inline
  def apply(
    attrs: StringDictionary[String] = null,
    existingPrefixes: StringDictionary[String] = null,
    prefix: String = null
  ): IXmlSignerOptions = {
    val __obj = js.Dynamic.literal()
    if (attrs != null) __obj.updateDynamic("attrs")(attrs.asInstanceOf[js.Any])
    if (existingPrefixes != null) __obj.updateDynamic("existingPrefixes")(existingPrefixes.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[IXmlSignerOptions]
  }
}

