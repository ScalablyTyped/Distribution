package typings.sentryCore.anon

import typings.sentryTypes.typesScopeMod.Scope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallCallback extends StObject {
  
  def apply(
    callback: js.Function1[(/* scope */ Scope) | (/* scope */ typings.sentryCore.typesScopeMod.Scope), Unit]
  ): Unit = js.native
}
