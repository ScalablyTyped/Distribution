package typings
package soapLib.soapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WsdlXmlns
  extends /* prop */ org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Unit] {
  var __tns__ : js.UndefOr[java.lang.String] = js.undefined
  var soap: js.UndefOr[java.lang.String] = js.undefined
  var tns: js.UndefOr[java.lang.String] = js.undefined
  var wsam: js.UndefOr[java.lang.String] = js.undefined
  var wsp: js.UndefOr[java.lang.String] = js.undefined
  var wsu: js.UndefOr[java.lang.String] = js.undefined
  var xsd: js.UndefOr[java.lang.String] = js.undefined
}

object WsdlXmlns {
  @scala.inline
  def apply(
    StringDictionary: /* prop */ org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Unit] = null,
    __tns__ : java.lang.String = null,
    soap: java.lang.String = null,
    tns: java.lang.String = null,
    wsam: java.lang.String = null,
    wsp: java.lang.String = null,
    wsu: java.lang.String = null,
    xsd: java.lang.String = null
  ): WsdlXmlns = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (__tns__ != null) __obj.updateDynamic("__tns__")(__tns__)
    if (soap != null) __obj.updateDynamic("soap")(soap)
    if (tns != null) __obj.updateDynamic("tns")(tns)
    if (wsam != null) __obj.updateDynamic("wsam")(wsam)
    if (wsp != null) __obj.updateDynamic("wsp")(wsp)
    if (wsu != null) __obj.updateDynamic("wsu")(wsu)
    if (xsd != null) __obj.updateDynamic("xsd")(xsd)
    __obj.asInstanceOf[WsdlXmlns]
  }
}

