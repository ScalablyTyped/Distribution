package typings.randomJs

import typings.randomJs.typesMod.Engine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uuid4Mod {
  
  @JSImport("random-js/dist/distribution/uuid4", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def uuid4(engine: Engine): String = ^.asInstanceOf[js.Dynamic].applyDynamic("uuid4")(engine.asInstanceOf[js.Any]).asInstanceOf[String]
}
