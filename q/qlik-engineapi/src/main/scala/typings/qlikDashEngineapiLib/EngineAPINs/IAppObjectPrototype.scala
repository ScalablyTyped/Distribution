package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IAppObjectPrototype[P /* <: IGenericObjectProperties */, O /* <: IGenericObject */] extends js.Object {
  def createObject(qProp: P): stdLib.Promise[O]
  def createSessionObject(qProp: P): stdLib.Promise[O]
}

