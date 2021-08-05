package typings.smoothScrollbar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rangeMod {
  
  @JSImport("smooth-scrollbar/decorators/range", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def range(): js.Function2[/* proto */ js.Any, /* key */ String, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("range")().asInstanceOf[js.Function2[/* proto */ js.Any, /* key */ String, Unit]]
  inline def range(min: Double): js.Function2[/* proto */ js.Any, /* key */ String, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("range")(min.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* proto */ js.Any, /* key */ String, Unit]]
  inline def range(min: Double, max: Double): js.Function2[/* proto */ js.Any, /* key */ String, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* proto */ js.Any, /* key */ String, Unit]]
  inline def range(min: Unit, max: Double): js.Function2[/* proto */ js.Any, /* key */ String, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* proto */ js.Any, /* key */ String, Unit]]
}
