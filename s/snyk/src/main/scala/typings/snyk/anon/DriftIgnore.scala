package typings.snyk.anon

import typings.node.streamMod.Stream
import typings.snyk.snykStrings.ignore
import typings.snyk.snykStrings.inherit
import typings.snyk.snykStrings.ipc
import typings.snyk.snykStrings.pipe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DriftIgnore extends StObject {
  
  var driftIgnore: js.UndefOr[js.Array[String]] = js.undefined
  
  var input: js.UndefOr[String] = js.undefined
  
  var options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DriftCTLOptions */ Any
  
  var stdio: js.UndefOr[
    pipe | ignore | inherit | (js.Array[js.UndefOr[Double | Stream | pipe | ignore | inherit | ipc | Null]])
  ] = js.undefined
}
object DriftIgnore {
  
  inline def apply(
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DriftCTLOptions */ Any
  ): DriftIgnore = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[DriftIgnore]
  }
  
  extension [Self <: DriftIgnore](x: Self) {
    
    inline def setDriftIgnore(value: js.Array[String]): Self = StObject.set(x, "driftIgnore", value.asInstanceOf[js.Any])
    
    inline def setDriftIgnoreUndefined: Self = StObject.set(x, "driftIgnore", js.undefined)
    
    inline def setDriftIgnoreVarargs(value: String*): Self = StObject.set(x, "driftIgnore", js.Array(value*))
    
    inline def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setOptions(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DriftCTLOptions */ Any
    ): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setStdio(
      value: pipe | ignore | inherit | (js.Array[js.UndefOr[Double | Stream | pipe | ignore | inherit | ipc | Null]])
    ): Self = StObject.set(x, "stdio", value.asInstanceOf[js.Any])
    
    inline def setStdioUndefined: Self = StObject.set(x, "stdio", js.undefined)
    
    inline def setStdioVarargs(value: (js.UndefOr[Double | Stream | pipe | ignore | inherit | ipc | Null])*): Self = StObject.set(x, "stdio", js.Array(value*))
  }
}
