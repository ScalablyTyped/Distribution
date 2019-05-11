package typings
package protobufjsLib.minimalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protobufjs/minimal", "Service")
@js.native
class Service protected ()
  extends protobufjsLib.protobufjsMod.Service {
  /**
    * Constructs a new service instance.
    * @param name Service name
    * @param [options] Service options
    * @throws {TypeError} If arguments are invalid
    */
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, options: org.scalablytyped.runtime.StringDictionary[js.Any]) = this()
}

/* static members */
@JSImport("protobufjs/minimal", "Service")
@js.native
object Service extends js.Object {
  /**
    * Constructs a service from a service descriptor.
    * @param name Service name
    * @param json Service descriptor
    * @returns Created service
    * @throws {TypeError} If arguments are invalid
    */
  def fromJSON(name: java.lang.String, json: protobufjsLib.protobufjsMod.IService): protobufjsLib.protobufjsMod.Service = js.native
}

