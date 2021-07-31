package typings.reactUid

import typings.react.mod.Context
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextMod {
  
  @JSImport("react-uid/dist/es5/context", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-uid/dist/es5/context", "counter")
  @js.native
  val counter: IdSourceType = js.native
  
  @scala.inline
  def createSource(): IdSourceType = ^.asInstanceOf[js.Dynamic].applyDynamic("createSource")().asInstanceOf[IdSourceType]
  @scala.inline
  def createSource(prefix: String): IdSourceType = ^.asInstanceOf[js.Dynamic].applyDynamic("createSource")(prefix.asInstanceOf[js.Any]).asInstanceOf[IdSourceType]
  
  @scala.inline
  def getId(source: IdSourceType): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getId")(source.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def getPrefix(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPrefix")().asInstanceOf[String]
  @scala.inline
  def getPrefix(source: IdSourceType): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPrefix")(source.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("react-uid/dist/es5/context", "source")
  @js.native
  val source: Context[IdSourceType] = js.native
  
  @js.native
  trait IdSourceType extends StObject {
    
    var prefix: String = js.native
    
    def uid(item: js.Any): String = js.native
    def uid(item: js.Any, index: Double): String = js.native
    
    var value: Double = js.native
  }
  
  trait UIDProps extends StObject {
    
    def children(id: String, uid: js.Function2[/* item */ js.Any, /* index */ js.UndefOr[Double], String]): ReactNode
    
    var idSource: js.UndefOr[IdSourceType] = js.undefined
    
    var name: js.UndefOr[js.Function1[/* n */ String | Double, String]] = js.undefined
  }
  object UIDProps {
    
    @scala.inline
    def apply(
      children: (String, js.Function2[/* item */ js.Any, /* index */ js.UndefOr[Double], String]) => ReactNode
    ): UIDProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction2(children))
      __obj.asInstanceOf[UIDProps]
    }
    
    @scala.inline
    implicit class UIDPropsMutableBuilder[Self <: UIDProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(
        value: (String, js.Function2[/* item */ js.Any, /* index */ js.UndefOr[Double], String]) => ReactNode
      ): Self = StObject.set(x, "children", js.Any.fromFunction2(value))
      
      @scala.inline
      def setIdSource(value: IdSourceType): Self = StObject.set(x, "idSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdSourceUndefined: Self = StObject.set(x, "idSource", js.undefined)
      
      @scala.inline
      def setName(value: /* n */ String | Double => String): Self = StObject.set(x, "name", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
}
