package typings
package receptacleLib.receptacleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Receptacle[T, X] extends js.Object {
  var id: scala.Double | java.lang.String = js.native
  var items: js.Array[Items[T]] = js.native
  var max: scala.Double = js.native
  var size: scala.Double = js.native
  def clear(): scala.Unit = js.native
  def delete(key: java.lang.String): scala.Unit = js.native
  def expire(key: java.lang.String, ms: scala.Double): scala.Unit = js.native
  def get(key: java.lang.String): T | scala.Null = js.native
  def has(key: java.lang.String): scala.Boolean = js.native
  def meta(key: java.lang.String): js.UndefOr[X] = js.native
  def set(key: java.lang.String, value: T): Receptacle[
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for T */ _, 
    js.UndefOr[scala.Nothing]
  ] = js.native
  def set(key: java.lang.String, value: T, options: SetOptions[X]): Receptacle[
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for T */ _, 
    js.UndefOr[scala.Nothing]
  ] = js.native
  def toJSON(): Export[T, X] = js.native
}

