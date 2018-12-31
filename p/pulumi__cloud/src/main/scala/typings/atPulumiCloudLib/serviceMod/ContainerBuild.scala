package typings
package atPulumiCloudLib.serviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerBuild extends js.Object {
  /**
    * An optional map of named build-time argument variables to set during the Docker build.  This flag allows you
    * to pass built-time variables that can be accessed like environment variables inside the `RUN` instruction.
    */
  var args: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  /**
    * An optional CacheFrom object with information about the build stages to use for the Docker build cache.
    * This parameter maps to the --cache-from argument to the Docker CLI. If this parameter is `true`, only the final
    * image will be pulled and passed to --cache-from; if it is a CacheFrom object, the stages named therein will
    * also be pulled and passed to --cache-from.
    */
  var cacheFrom: js.UndefOr[scala.Boolean | CacheFrom] = js.undefined
  /**
    * context is a path to a directory to use for the Docker build context, usually the directory in which the
    * Dockerfile resides (although dockerfile may be used to choose a custom location independent of this choice).
    * If not specified, the context defaults to the current working directory; if a relative path is used, it
    * is relative to the current working directory that Pulumi is evaluating.
    */
  var context: js.UndefOr[java.lang.String] = js.undefined
  /**
    * dockerfile may be used to override the default Dockerfile name and/or location.  By default, it is assumed
    * to be a file named Dockerfile in the root of the build context.
    */
  var dockerfile: js.UndefOr[java.lang.String] = js.undefined
}

