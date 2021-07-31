package typings.reactSpringShared

import org.scalablytyped.runtime.TopLevel
import typings.allocTypes.mod.Omit
import typings.allocTypes.mod.Remap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUtilMod {
  
  @JSImport("@react-spring/shared/cjs/types.util", "Any")
  @js.native
  class Any ()
    extends typings.allocTypes.mod.Any
  
  type Arrify[T] = js.Array[js.Any]
  
  type AssignableKeys[T, U] = /* import warning: importer.ImportType#apply Failed type conversion: {[ P in std.Extract<keyof T, keyof U> ]: T[P] extends U[P]? P : never}[std.Extract<keyof T, keyof U>] */ js.Any
  
  type Constrain[T, U] = U | T
  
  type Merge[A, B] = Remap[
    typings.reactSpringShared.reactSpringSharedStrings.Merge & TopLevel[js.Any] & (Omit[B, /* keyof A */ String])
  ]
}
