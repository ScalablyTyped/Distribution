package typings.smoothScrollbar

import typings.smoothScrollbar.anon.Get
import typings.std.PropertyDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object decoratorsMod {
  
  @JSImport("smooth-scrollbar/decorators", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def boolean(proto: js.Any, key: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("boolean")(proto.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def debounce(options: js.Any*): js.Function3[/* _proto */ js.Any, /* key */ String, /* descriptor */ PropertyDescriptor, Get] = ^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* _proto */ js.Any, /* key */ String, /* descriptor */ PropertyDescriptor, Get]]
  
  inline def range(): js.Function2[/* proto */ js.Any, /* key */ String, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("range")().asInstanceOf[js.Function2[/* proto */ js.Any, /* key */ String, Unit]]
  inline def range(min: Double): js.Function2[/* proto */ js.Any, /* key */ String, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("range")(min.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* proto */ js.Any, /* key */ String, Unit]]
  inline def range(min: Double, max: Double): js.Function2[/* proto */ js.Any, /* key */ String, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* proto */ js.Any, /* key */ String, Unit]]
  inline def range(min: Unit, max: Double): js.Function2[/* proto */ js.Any, /* key */ String, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* proto */ js.Any, /* key */ String, Unit]]
}
