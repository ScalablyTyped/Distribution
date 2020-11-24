package typings.qunit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object global {
  
  type QUnit = typings.qunit.mod.global.QUnit_
  
  type moduleFunc1 = js.Function3[
    /* name */ java.lang.String, 
    /* hooks */ js.UndefOr[typings.qunit.mod.global.Hooks], 
    /* nested */ js.UndefOr[js.Function1[/* hooks */ typings.qunit.mod.global.NestedHooks, scala.Unit]], 
    scala.Unit
  ]
  
  type moduleFunc2 = js.Function2[
    /* name */ java.lang.String, 
    /* nested */ js.UndefOr[js.Function1[/* hooks */ typings.qunit.mod.global.NestedHooks, scala.Unit]], 
    scala.Unit
  ]
}
