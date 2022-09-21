package typings.quadstore

import typings.quadstore.typesMod.TSReadable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object consumeonebyoneMod {
  
  @JSImport("quadstore/dist/cjs/utils/consumeonebyone", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def consumeOneByOne[T](iterator: TSReadable[T], onEachItem: js.Function1[/* item */ T, Any]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("consumeOneByOne")(iterator.asInstanceOf[js.Any], onEachItem.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
