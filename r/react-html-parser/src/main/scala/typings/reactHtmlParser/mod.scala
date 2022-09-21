package typings.reactHtmlParser

import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-html-parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(html: String): js.Array[ReactElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(html.asInstanceOf[js.Any]).asInstanceOf[js.Array[ReactElement]]
  inline def default(html: String, options: Options): js.Array[ReactElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(html.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[ReactElement]]
  
  inline def convertNodeToElement(
    node: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DomElement */ Any,
    index: Double,
    transform: Transform
  ): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("convertNodeToElement")(node.asInstanceOf[js.Any], index.asInstanceOf[js.Any], transform.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
  
  inline def processNodes(
    nodes: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DomElement */ Any
    ],
    transform: Transform
  ): js.Array[ReactElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("processNodes")(nodes.asInstanceOf[js.Any], transform.asInstanceOf[js.Any])).asInstanceOf[js.Array[ReactElement]]
  
  trait Options extends StObject {
    
    var decodeEntities: js.UndefOr[Boolean] = js.undefined
    
    var preprocessNodes: js.UndefOr[
        js.Function1[
          /* nodes */ js.Array[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DomElement */ Any
          ], 
          Any
        ]
      ] = js.undefined
    
    var transform: js.UndefOr[Transform] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setDecodeEntities(value: Boolean): Self = StObject.set(x, "decodeEntities", value.asInstanceOf[js.Any])
      
      inline def setDecodeEntitiesUndefined: Self = StObject.set(x, "decodeEntities", js.undefined)
      
      inline def setPreprocessNodes(
        value: /* nodes */ js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DomElement */ Any
            ] => Any
      ): Self = StObject.set(x, "preprocessNodes", js.Any.fromFunction1(value))
      
      inline def setPreprocessNodesUndefined: Self = StObject.set(x, "preprocessNodes", js.undefined)
      
      inline def setTransform(value: Transform): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    }
  }
  
  @js.native
  trait Transform extends StObject {
    
    def apply(
      node: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DomElement */ Any,
      index: Double
    ): ReactElement | Unit | Null = js.native
    def apply(
      node: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DomElement */ Any,
      index: Double,
      transform: Transform
    ): ReactElement | Unit | Null = js.native
  }
}
