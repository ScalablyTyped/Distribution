package typings.snyk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibEcosystemsUnmanagedUtilsMod {
  
  @JSImport("snyk/dist/lib/ecosystems/unmanaged/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convertDepGraph[T](depGraphOpenApi: T): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("convertDepGraph")(depGraphOpenApi.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def convertMapCasing[T](obj: Any): T = ^.asInstanceOf[js.Dynamic].applyDynamic("convertMapCasing")(obj.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def convertObjectArrayCasing[T](arr: js.Array[Any]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertObjectArrayCasing")(arr.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  inline def convertToCamelCase[T](obj: Any): T = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToCamelCase")(obj.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def getSelf(): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSelf")().asInstanceOf[js.Promise[Any]]
  
  inline def makeSelfRequest(): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeSelfRequest")().asInstanceOf[js.Promise[Any]]
}
