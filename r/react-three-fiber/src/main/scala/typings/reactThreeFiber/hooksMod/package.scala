package typings.reactThreeFiber

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object hooksMod {
  
  type Extensions = js.Function1[/* loader */ typings.three.mod.Loader, scala.Unit]
  
  type LoaderResult[T] = typings.reactThreeFiber.hooksMod.Loader[
    (/* import warning: importer.ImportType#apply Failed type conversion: T[number] */ js.Any) | T
  ]
}
