package typings.resolveExports

import typings.resolveExports.anon.BrowserFields
import typings.resolveExports.anon.Fields
import typings.resolveExports.anon.`0`
import typings.resolveExports.mod.Browser
import typings.resolveExports.mod.Exports_.Output
import typings.resolveExports.mod.Options
import typings.resolveExports.resolveExportsBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object resolveExportsMod {
  
  @JSImport("resolve/exports", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def exports[T](pkg: T, target: String): Output | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("exports")(pkg.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Output | Unit]
  inline def exports[T](pkg: T, target: String, options: Options): Output | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("exports")(pkg.asInstanceOf[js.Any], target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Output | Unit]
  
  inline def imports[T](pkg: T): typings.resolveExports.mod.Imports_.Output | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("imports")(pkg.asInstanceOf[js.Any]).asInstanceOf[typings.resolveExports.mod.Imports_.Output | Unit]
  inline def imports[T](pkg: T, entry: String): typings.resolveExports.mod.Imports_.Output | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("imports")(pkg.asInstanceOf[js.Any], entry.asInstanceOf[js.Any])).asInstanceOf[typings.resolveExports.mod.Imports_.Output | Unit]
  inline def imports[T](pkg: T, entry: String, options: Options): typings.resolveExports.mod.Imports_.Output | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("imports")(pkg.asInstanceOf[js.Any], entry.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.resolveExports.mod.Imports_.Output | Unit]
  inline def imports[T](pkg: T, entry: Unit, options: Options): typings.resolveExports.mod.Imports_.Output | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("imports")(pkg.asInstanceOf[js.Any], entry.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.resolveExports.mod.Imports_.Output | Unit]
  
  inline def legacy[T](pkg: T): Browser | String = ^.asInstanceOf[js.Dynamic].applyDynamic("legacy")(pkg.asInstanceOf[js.Any]).asInstanceOf[Browser | String]
  inline def legacy[T](pkg: T, options: typings.resolveExports.anon.Browser): Browser | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("legacy")(pkg.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Browser | Unit]
  inline def legacy[T](pkg: T, options: BrowserFields): String | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("legacy")(pkg.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | Unit]
  inline def legacy[T](pkg: T, options: Fields): String | `false` | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("legacy")(pkg.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | `false` | Unit]
  inline def legacy[T](pkg: T, options: `0`): Browser | String = (^.asInstanceOf[js.Dynamic].applyDynamic("legacy")(pkg.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Browser | String]
  
  inline def resolve[T](pkg: T): typings.resolveExports.mod.Imports_.Output | Output | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(pkg.asInstanceOf[js.Any]).asInstanceOf[typings.resolveExports.mod.Imports_.Output | Output | Unit]
  inline def resolve[T](pkg: T, entry: String): typings.resolveExports.mod.Imports_.Output | Output | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(pkg.asInstanceOf[js.Any], entry.asInstanceOf[js.Any])).asInstanceOf[typings.resolveExports.mod.Imports_.Output | Output | Unit]
  inline def resolve[T](pkg: T, entry: String, options: Options): typings.resolveExports.mod.Imports_.Output | Output | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(pkg.asInstanceOf[js.Any], entry.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.resolveExports.mod.Imports_.Output | Output | Unit]
  inline def resolve[T](pkg: T, entry: Unit, options: Options): typings.resolveExports.mod.Imports_.Output | Output | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(pkg.asInstanceOf[js.Any], entry.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.resolveExports.mod.Imports_.Output | Output | Unit]
}
