package typings.reactMdUtils

import typings.react.mod.Context
import typings.reactMdUtils.anon.AppSizeinitializedboolean
import typings.reactMdUtils.useAppSizeMediaMod.AppSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useAppSizeMod {
  
  @JSImport("@react-md/utils/types/sizing/useAppSize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-md/utils/types/sizing/useAppSize", "AppSizeContext")
  @js.native
  val AppSizeContext: Context[AppSizeinitializedboolean] = js.native
  
  inline def useAppSize(): AppSize = ^.asInstanceOf[js.Dynamic].applyDynamic("useAppSize")().asInstanceOf[AppSize]
}
