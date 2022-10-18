package typings.retextEquality

import typings.nlcstSearch.mod.Handler
import typings.unified.mod.Processor
import typings.unified.mod.Transformer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFactoryMod {
  
  @JSImport("retext-equality/lib/factory", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def factory(patterns: js.Array[Pattern], lang: String): js.ThisFunction1[
    /* this */ Processor[Unit, typings.nlcst.mod.Root, Unit, Unit], 
    /* options */ js.UndefOr[Options], 
    Unit | (Transformer[typings.nlcst.mod.Root, typings.nlcst.mod.Root])
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("factory")(patterns.asInstanceOf[js.Any], lang.asInstanceOf[js.Any])).asInstanceOf[js.ThisFunction1[
    /* this */ Processor[Unit, typings.nlcst.mod.Root, Unit, Unit], 
    /* options */ js.UndefOr[Options], 
    Unit | (Transformer[typings.nlcst.mod.Root, typings.nlcst.mod.Root])
  ]]
  
  type Content = typings.nlcst.mod.Content
  
  trait Match extends StObject {
    
    var end: Double
    
    var nodes: js.Array[Content]
    
    var parent: Parent
    
    var start: Double
    
    var `type`: String
  }
  object Match {
    
    inline def apply(end: Double, nodes: js.Array[Content], parent: Parent, start: Double, `type`: String): Match = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Match]
    }
    
    extension [Self <: Match](x: Self) {
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setNodes(value: js.Array[Content]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      inline def setNodesVarargs(value: Content*): Self = StObject.set(x, "nodes", js.Array(value*))
      
      inline def setParent(value: Parent): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    var ignore: js.UndefOr[js.Array[String]] = js.undefined
    
    var noBinary: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setIgnore(value: js.Array[String]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      inline def setIgnoreVarargs(value: String*): Self = StObject.set(x, "ignore", js.Array(value*))
      
      inline def setNoBinary(value: Boolean): Self = StObject.set(x, "noBinary", value.asInstanceOf[js.Any])
      
      inline def setNoBinaryUndefined: Self = StObject.set(x, "noBinary", js.undefined)
    }
  }
  
  type Parent = typings.nlcst.mod.Parent
  
  type Pattern = typings.retextEquality.libEnMod.Pattern
  
  type Root = typings.nlcst.mod.Root
  
  type SearchHandle = Handler
  
  type Sentence = typings.nlcst.mod.Sentence
  
  type SentenceContent = typings.nlcst.mod.SentenceContent
  
  type VFile = typings.vfile.mod.VFile
}
