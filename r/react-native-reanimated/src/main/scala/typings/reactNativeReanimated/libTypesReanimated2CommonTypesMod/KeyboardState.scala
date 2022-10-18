package typings.reactNativeReanimated.libTypesReanimated2CommonTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait KeyboardState extends StObject
@JSImport("react-native-reanimated/lib/types/reanimated2/commonTypes", "KeyboardState")
@js.native
object KeyboardState extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[KeyboardState & Double] = js.native
  
  @js.native
  sealed trait CLOSED
    extends StObject
       with KeyboardState
  /* 4 */ val CLOSED: typings.reactNativeReanimated.libTypesReanimated2CommonTypesMod.KeyboardState.CLOSED & Double = js.native
  
  @js.native
  sealed trait CLOSING
    extends StObject
       with KeyboardState
  /* 3 */ val CLOSING: typings.reactNativeReanimated.libTypesReanimated2CommonTypesMod.KeyboardState.CLOSING & Double = js.native
  
  @js.native
  sealed trait OPEN
    extends StObject
       with KeyboardState
  /* 2 */ val OPEN: typings.reactNativeReanimated.libTypesReanimated2CommonTypesMod.KeyboardState.OPEN & Double = js.native
  
  @js.native
  sealed trait OPENING
    extends StObject
       with KeyboardState
  /* 1 */ val OPENING: typings.reactNativeReanimated.libTypesReanimated2CommonTypesMod.KeyboardState.OPENING & Double = js.native
  
  @js.native
  sealed trait UNKNOWN
    extends StObject
       with KeyboardState
  /* 0 */ val UNKNOWN: typings.reactNativeReanimated.libTypesReanimated2CommonTypesMod.KeyboardState.UNKNOWN & Double = js.native
}
