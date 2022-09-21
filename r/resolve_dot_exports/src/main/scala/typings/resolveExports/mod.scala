package typings.resolveExports

import typings.resolveExports.anon.BrowserFields
import typings.resolveExports.anon.Fields
import typings.resolveExports.anon.`0`
import typings.resolveExports.anon.`1`
import typings.resolveExports.resolveExportsBooleans.`false`
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("resolve.exports", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def legacy[T](pkg: T): BrowserFiles | String | `false` | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("legacy")(pkg.asInstanceOf[js.Any]).asInstanceOf[BrowserFiles | String | `false` | Unit]
  inline def legacy[T](pkg: T, options: BrowserFields): String | `false` | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("legacy")(pkg.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | `false` | Unit]
  inline def legacy[T](pkg: T, options: Fields): BrowserFiles | String | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("legacy")(pkg.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[BrowserFiles | String | Unit]
  inline def legacy[T](pkg: T, options: `0`): String | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("legacy")(pkg.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | Unit]
  inline def legacy[T](pkg: T, options: `1`): BrowserFiles | String | `false` | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("legacy")(pkg.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[BrowserFiles | String | `false` | Unit]
  
  inline def resolve[T](pkg: T, entry: String): String | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(pkg.asInstanceOf[js.Any], entry.asInstanceOf[js.Any])).asInstanceOf[String | Unit]
  inline def resolve[T](pkg: T, entry: String, options: Options): String | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(pkg.asInstanceOf[js.Any], entry.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | Unit]
  
  type BrowserFiles = Record[String, String | `false`]
  
  /* Rewritten from type alias, can be one of: 
    - typings.resolveExports.anon.Browser
    - typings.resolveExports.anon.Conditions
  */
  trait Options extends StObject
  object Options {
    
    inline def Browser(): typings.resolveExports.anon.Browser = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.resolveExports.anon.Browser]
    }
    
    inline def Conditions(): typings.resolveExports.anon.Conditions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.resolveExports.anon.Conditions]
    }
  }
}
