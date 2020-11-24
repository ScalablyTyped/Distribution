package typings.reactNativeSafeAreaContext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object safeAreaTypesMod {
  
  type InsetChangeNativeCallback = js.Function1[
    /* event */ typings.reactNativeSafeAreaContext.safeAreaTypesMod.InsetChangedEvent, 
    scala.Unit
  ]
  
  type InsetChangedEvent = typings.reactNative.mod.NativeSyntheticEvent[typings.reactNativeSafeAreaContext.safeAreaTypesMod.Metrics]
}
