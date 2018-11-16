package typings
package soapLib.soapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait WsdlSchema extends XsdTypeBase {
  var children: js.Array[_]
  var complexTypes: js.UndefOr[WsdlElements] = js.undefined
  var elements: js.UndefOr[WsdlElements] = js.undefined
  var includes: js.Array[_]
  var name: java.lang.String
  var nsName: java.lang.String
  var prefix: java.lang.String
  var types: js.UndefOr[WsdlElements] = js.undefined
  @JSName("xmlns")
  var xmlns_WsdlSchema: WsdlXmlns
}

