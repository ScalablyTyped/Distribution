package typings.receptacle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Receptacle[T, X] extends js.Object {
  
  def clear(): Unit = js.native
  
  def delete(key: String): Unit = js.native
  
  def expire(key: String, ms: Double): Unit = js.native
  
  def get(key: String): T | Null = js.native
  
  def has(key: String): Boolean = js.native
  
  var id: Double | String = js.native
  
  var items: js.Array[Items[T]] = js.native
  
  var max: Double = js.native
  
  def meta(key: String): js.UndefOr[X] = js.native
  
  def set(key: String, value: T): Receptacle[
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for T */ _, 
    js.UndefOr[scala.Nothing]
  ] = js.native
  def set(key: String, value: T, options: SetOptions[X]): Receptacle[
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for T */ _, 
    js.UndefOr[scala.Nothing]
  ] = js.native
  
  var size: Double = js.native
  
  def toJSON(): Export[T, X] = js.native
}
