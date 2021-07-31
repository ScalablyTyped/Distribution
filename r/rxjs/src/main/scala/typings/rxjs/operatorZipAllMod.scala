package typings.rxjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorZipAllMod {
  
  @JSImport("rxjs/operator/zipAll", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def zipAll[T](): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("zipAll")().asInstanceOf[js.Any]
  @scala.inline
  def zipAll[R](project: js.Function1[/* repeated */ js.Any, R]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("zipAll")(project.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def zipAll_TR[T, R](): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("zipAll")().asInstanceOf[js.Any]
  @scala.inline
  def zipAll_TR[T, R](project: js.Function1[/* repeated */ T, R]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("zipAll")(project.asInstanceOf[js.Any]).asInstanceOf[js.Any]
}
