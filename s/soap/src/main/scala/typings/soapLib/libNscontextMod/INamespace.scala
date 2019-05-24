package typings
package soapLib.libNscontextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INamespace extends js.Object {
  var declared: scala.Boolean
  var prefix: java.lang.String
  var uri: java.lang.String
}

object INamespace {
  @scala.inline
  def apply(declared: scala.Boolean, prefix: java.lang.String, uri: java.lang.String): INamespace = {
    val __obj = js.Dynamic.literal(declared = declared, prefix = prefix, uri = uri)
  
    __obj.asInstanceOf[INamespace]
  }
}

