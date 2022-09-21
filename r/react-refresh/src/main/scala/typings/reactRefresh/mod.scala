package typings.reactRefresh

import typings.reactRefresh.runtimeMod.AnyFn
import typings.reactRefresh.runtimeMod.Family
import typings.reactRefresh.runtimeMod.Instance
import typings.reactRefresh.runtimeMod.RefreshUpdate
import typings.std.Set
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-refresh", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def collectCustomHooksForSignature(`type`: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("collectCustomHooksForSignature")(`type`.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def createSignatureFunctionForTransform(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createSignatureFunctionForTransform")().asInstanceOf[Unit]
  
  inline def findAffectedHostInstances(families: js.Array[Family]): Set[Instance] = ^.asInstanceOf[js.Dynamic].applyDynamic("findAffectedHostInstances")(families.asInstanceOf[js.Any]).asInstanceOf[Set[Instance]]
  
  inline def getFamilyByID(id: String): Family | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getFamilyByID")(id.asInstanceOf[js.Any]).asInstanceOf[Family | Unit]
  
  inline def getFamilyByType(`type`: Any): Family | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getFamilyByType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Family | Unit]
  
  inline def hasUnrecoverableErrors(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasUnrecoverableErrors")().asInstanceOf[Boolean]
  
  inline def injectIntoGlobalHook(globalObject: Window): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("injectIntoGlobalHook")(globalObject.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def isLikelyComponentType(`type`: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLikelyComponentType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def performReactRefresh(): RefreshUpdate | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("performReactRefresh")().asInstanceOf[RefreshUpdate | Null]
  
  inline def register(`type`: Any, id: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("register")(`type`.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setSignature(`type`: Any, key: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setSignature")(`type`.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setSignature(`type`: Any, key: String, forceReset: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setSignature")(`type`.asInstanceOf[js.Any], key.asInstanceOf[js.Any], forceReset.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setSignature(`type`: Any, key: String, forceReset: Boolean, getCustomHooks: js.Function0[AnyFn]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setSignature")(`type`.asInstanceOf[js.Any], key.asInstanceOf[js.Any], forceReset.asInstanceOf[js.Any], getCustomHooks.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setSignature(`type`: Any, key: String, forceReset: Unit, getCustomHooks: js.Function0[AnyFn]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setSignature")(`type`.asInstanceOf[js.Any], key.asInstanceOf[js.Any], forceReset.asInstanceOf[js.Any], getCustomHooks.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
