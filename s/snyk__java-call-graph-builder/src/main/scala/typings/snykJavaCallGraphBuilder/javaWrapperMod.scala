package typings.snykJavaCallGraphBuilder

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@snyk/java-call-graph-builder/dist/java-wrapper", JSImport.Namespace)
@js.native
object javaWrapperMod extends js.Object {
  def getCallGraph(classPath: String, targetPath: String): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Graph */ _
  ] = js.native
  def getClassPerJarMapping(classPath: String): js.Promise[StringDictionary[String]] = js.native
  def getEntrypoints(targetPath: String): js.Promise[js.Array[String]] = js.native
}

