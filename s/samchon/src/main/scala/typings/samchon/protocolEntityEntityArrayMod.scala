package typings.samchon

import typings.samchon.protocolEntityIentityMod.IEntity
import typings.sxml.mod.XML
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object protocolEntityEntityArrayMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.Vector<T> * / any */ /* note: abstract class */ @JSImport("samchon/protocol/entity/EntityArray", "EntityArray")
  @js.native
  open class EntityArray[T /* <: IEntity */] () extends StObject {
    
    /**
      * @inheritdoc
      */
    def CHILD_TAG(): String = js.native
    
    /**
      * @inheritdoc
      */
    def TAG(): String = js.native
    
    /**
      * @inheritdoc
      */
    def construct(xml: XML): Unit = js.native
    
    /**
      * @inheritdoc
      */
    def count(key: Any): Double = js.native
    
    /**
      * @inheritdoc
      */
    def createChild(xml: XML): T = js.native
    
    /**
      * @inheritdoc
      */
    def get(key: Any): T = js.native
    
    /**
      * @inheritdoc
      */
    def has(key: Any): Boolean = js.native
    
    /**
      * @inheritdoc
      */
    def key(): Any = js.native
    
    /**
      * @inheritdoc
      */
    def toXML(): XML = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.Deque<T> * / any */ /* note: abstract class */ @JSImport("samchon/protocol/entity/EntityArray", "EntityDeque")
  @js.native
  open class EntityDeque[T /* <: IEntity */] () extends StObject {
    
    /**
      * @inheritdoc
      */
    def CHILD_TAG(): String = js.native
    
    /**
      * @inheritdoc
      */
    def TAG(): String = js.native
    
    /**
      * @inheritdoc
      */
    def construct(xml: XML): Unit = js.native
    
    /**
      * @inheritdoc
      */
    def count(key: Any): Double = js.native
    
    /**
      * @inheritdoc
      */
    def createChild(xml: XML): T = js.native
    
    /**
      * @inheritdoc
      */
    def get(key: Any): T = js.native
    
    /**
      * @inheritdoc
      */
    def has(key: Any): Boolean = js.native
    
    /**
      * @inheritdoc
      */
    def key(): Any = js.native
    
    /**
      * @inheritdoc
      */
    def toXML(): XML = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.List<T> * / any */ /* note: abstract class */ @JSImport("samchon/protocol/entity/EntityArray", "EntityList")
  @js.native
  open class EntityList[T /* <: IEntity */] () extends StObject {
    
    /**
      * @inheritdoc
      */
    def CHILD_TAG(): String = js.native
    
    /**
      * @inheritdoc
      */
    def TAG(): String = js.native
    
    /**
      * @inheritdoc
      */
    def construct(xml: XML): Unit = js.native
    
    /**
      * @inheritdoc
      */
    def count(key: Any): Double = js.native
    
    /**
      * @inheritdoc
      */
    def createChild(xml: XML): T = js.native
    
    /**
      * @inheritdoc
      */
    def get(key: Any): T = js.native
    
    /**
      * @inheritdoc
      */
    def has(key: Any): Boolean = js.native
    
    /**
      * @inheritdoc
      */
    def key(): Any = js.native
    
    /**
      * @inheritdoc
      */
    def toXML(): XML = js.native
  }
}
