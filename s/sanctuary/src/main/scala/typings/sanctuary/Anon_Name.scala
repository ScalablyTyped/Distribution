package typings.sanctuary

import typings.sanctuary.sanctuaryMod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name extends js.Object {
  var name: String
  var namespace: Maybe[String]
  var version: NonNegativeInteger
}

object Anon_Name {
  @scala.inline
  def apply(name: String, namespace: Maybe[String], version: NonNegativeInteger): Anon_Name = {
    val __obj = js.Dynamic.literal(name = name, namespace = namespace, version = version)
  
    __obj.asInstanceOf[Anon_Name]
  }
}

