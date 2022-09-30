package typings.sphereEngineBrowser.global

import typings.sphereEngineBrowser.ShaderOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a shader program used to control low-level graphics rendering.
  */
@JSGlobal("Shader")
@js.native
open class Shader protected ()
  extends StObject
     with typings.sphereEngineBrowser.Shader {
  /**
    * Construct a new shader program. The shader can be used immediately, but will not have an
    * effect on rendering until it's fully loaded.
    * @param options Options for creating the new shader program.
    */
  def this(options: ShaderOptions) = this()
}
object Shader {
  
  @JSGlobal("Shader")
  @js.native
  val ^ : js.Any = js.native
  
  /** The default shader program provided by the engine. */
  /* static member */
  @JSGlobal("Shader.Default")
  @js.native
  val Default: typings.sphereEngineBrowser.Shader = js.native
  
  /**
    * Load the given shader files in the background and construct a new shader program from them.
    * @async
    * @param options Options for creating the new shader program.
    * @returns A promise for the new `Shader` object.
    */
  /* static member */
  inline def fromFiles(options: ShaderOptions): js.Promise[typings.sphereEngineBrowser.Shader] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromFiles")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.sphereEngineBrowser.Shader]]
}
