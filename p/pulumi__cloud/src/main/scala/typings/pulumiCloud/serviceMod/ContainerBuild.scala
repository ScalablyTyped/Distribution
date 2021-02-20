package typings.pulumiCloud.serviceMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContainerBuild extends StObject {
  
  /**
    * An optional map of named build-time argument variables to set during the Docker build.  This flag allows you
    * to pass built-time variables that can be accessed like environment variables inside the `RUN` instruction.
    */
  var args: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * An optional CacheFrom object with information about the build stages to use for the Docker build cache.
    * This parameter maps to the --cache-from argument to the Docker CLI. If this parameter is `true`, only the final
    * image will be pulled and passed to --cache-from; if it is a CacheFrom object, the stages named therein will
    * also be pulled and passed to --cache-from.
    */
  var cacheFrom: js.UndefOr[Boolean | CacheFrom] = js.native
  
  /**
    * context is a path to a directory to use for the Docker build context, usually the directory in which the
    * Dockerfile resides (although dockerfile may be used to choose a custom location independent of this choice).
    * If not specified, the context defaults to the current working directory; if a relative path is used, it
    * is relative to the current working directory that Pulumi is evaluating.
    */
  var context: js.UndefOr[String] = js.native
  
  /**
    * dockerfile may be used to override the default Dockerfile name and/or location.  By default, it is assumed
    * to be a file named Dockerfile in the root of the build context.
    */
  var dockerfile: js.UndefOr[String] = js.native
}
object ContainerBuild {
  
  @scala.inline
  def apply(): ContainerBuild = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerBuild]
  }
  
  @scala.inline
  implicit class ContainerBuildMutableBuilder[Self <: ContainerBuild] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: StringDictionary[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    @scala.inline
    def setCacheFrom(value: Boolean | CacheFrom): Self = StObject.set(x, "cacheFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheFromUndefined: Self = StObject.set(x, "cacheFrom", js.undefined)
    
    @scala.inline
    def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    @scala.inline
    def setDockerfile(value: String): Self = StObject.set(x, "dockerfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDockerfileUndefined: Self = StObject.set(x, "dockerfile", js.undefined)
  }
}
