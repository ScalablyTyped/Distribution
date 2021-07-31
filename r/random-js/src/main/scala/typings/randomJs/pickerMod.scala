package typings.randomJs

import typings.randomJs.typesMod.Distribution
import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pickerMod {
  
  @JSImport("random-js/dist/distribution/picker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def picker[T](source: ArrayLike[T]): Distribution[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("picker")(source.asInstanceOf[js.Any]).asInstanceOf[Distribution[T]]
  @scala.inline
  def picker[T](source: ArrayLike[T], begin: Double): Distribution[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("picker")(source.asInstanceOf[js.Any], begin.asInstanceOf[js.Any])).asInstanceOf[Distribution[T]]
  @scala.inline
  def picker[T](source: ArrayLike[T], begin: Double, end: Double): Distribution[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("picker")(source.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Distribution[T]]
  @scala.inline
  def picker[T](source: ArrayLike[T], begin: Unit, end: Double): Distribution[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("picker")(source.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Distribution[T]]
}
