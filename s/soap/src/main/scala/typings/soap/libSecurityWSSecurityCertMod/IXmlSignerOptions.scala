package typings.soap.libSecurityWSSecurityCertMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IXmlSignerOptions extends js.Object {
  var existingPrefixes: js.UndefOr[StringDictionary[String]] = js.undefined
}

object IXmlSignerOptions {
  @scala.inline
  def apply(existingPrefixes: StringDictionary[String] = null): IXmlSignerOptions = {
    val __obj = js.Dynamic.literal()
    if (existingPrefixes != null) __obj.updateDynamic("existingPrefixes")(existingPrefixes.asInstanceOf[js.Any])
    __obj.asInstanceOf[IXmlSignerOptions]
  }
}

