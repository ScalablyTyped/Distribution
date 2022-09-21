package typings.quadstore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uidMod {
  
  @JSImport("quadstore/dist/cjs/utils/uid", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createUid(len: Double): js.Function0[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("createUid")(len.asInstanceOf[js.Any]).asInstanceOf[js.Function0[String]]
  
  inline def uid(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("uid")().asInstanceOf[String]
}
