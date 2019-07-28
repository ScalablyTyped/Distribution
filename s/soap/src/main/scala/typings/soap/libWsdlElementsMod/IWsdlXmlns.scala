package typings.soap.libWsdlElementsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWsdlXmlns extends /* prop */ StringDictionary[String | Unit] {
  var __tns__ : js.UndefOr[String] = js.undefined
  var soap: js.UndefOr[String] = js.undefined
  var tns: js.UndefOr[String] = js.undefined
  var wsam: js.UndefOr[String] = js.undefined
  var wsp: js.UndefOr[String] = js.undefined
  var wsu: js.UndefOr[String] = js.undefined
  var xsd: js.UndefOr[String] = js.undefined
}

object IWsdlXmlns {
  @scala.inline
  def apply(
    StringDictionary: /* prop */ StringDictionary[String | Unit] = null,
    __tns__ : String = null,
    soap: String = null,
    tns: String = null,
    wsam: String = null,
    wsp: String = null,
    wsu: String = null,
    xsd: String = null
  ): IWsdlXmlns = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (__tns__ != null) __obj.updateDynamic("__tns__")(__tns__)
    if (soap != null) __obj.updateDynamic("soap")(soap)
    if (tns != null) __obj.updateDynamic("tns")(tns)
    if (wsam != null) __obj.updateDynamic("wsam")(wsam)
    if (wsp != null) __obj.updateDynamic("wsp")(wsp)
    if (wsu != null) __obj.updateDynamic("wsu")(wsu)
    if (xsd != null) __obj.updateDynamic("xsd")(xsd)
    __obj.asInstanceOf[IWsdlXmlns]
  }
}

