package typings.samchon

import typings.samchon.ientityMod.IEntity
import typings.sxml.mod.XML
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ientitygroupMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.Container<T, SourceT, IteratorT, ReverseT> * / any */ @js.native
  trait IEntityGroup[T /* <: IEntity */, SourceT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.Container<T, SourceT, IteratorT, ReverseT> */ js.Any */, IteratorT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.Iterator<T, SourceT, IteratorT, ReverseT> */ js.Any */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ js.Any */] extends IEntity {
    
    /**
      * A tag name of children objects.
      */
    def CHILD_TAG(): String = js.native
    
    /**
      * Count elements with a specific key.
      *
      * Searches the container for elements whose key is *key* and returns the number of elements found.
      *
      * @param key Key value to be searched for.
      *
      * @return The number of elements in the container with a *key*.
      */
    def count(key: js.Any): Double = js.native
    
    /**
      * Factory method of a child Entity.
      *
      * EntityArray::createChild() is a factory method creating a new child Entity which is belonged
      * to the EntityArray. This method is called by EntityArray::construct(). The children construction
      * methods Entity::construct() will be called by abstract method of the EntityArray::construct().
      *
      * @return A new child Entity belongs to EntityArray.
      */
    def createChild(xml: XML): T = js.native
    
    /**
      * Get an element
      *
      * Returns a reference to the mapped value of the element identified with *key*.
      *
      * @param key Key value of the element whose mapped value is accessed.
      *
      * @throw exception out of range
      *
      * @return A reference object of the mapped value (_Ty)
      */
    def get(key: js.Any): T = js.native
    
    /**
      * Get iterator to element.
      *
      * Searches the container for an element with a identifier equivalent to *key* and returns an
      * iterator to it if found, otherwise it returns an iterator to {@link end end()}.
      *
      * Two keys are considered equivalent if the container's comparison object returns false reflexively
      * (i.e., no matter the order in which the elements are passed as arguments).
      *
      * Another member functions, {@link has has()} and {@link count count()}, can be used to just check
      * whether a particular *key* exists.
      *
      * @param key Key to be searched for
      * @return An iterator to the element, if an element with specified *key* is found, or
      *		   {@link end end()} otherwise.
      */
    /**
      * Whether have the item or not.
      *
      * Indicates whether a map has an item having the specified identifier.
      *
      * @param key Key value of the element whose mapped value is accessed.
      *
      * @return Whether the map has an item having the specified identifier.
      */
    def has(key: js.Any): Boolean = js.native
  }
  object IEntityGroup {
    
    @scala.inline
    def apply[T /* <: IEntity */, SourceT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.Container<T, SourceT, IteratorT, ReverseT> */ js.Any */, IteratorT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.Iterator<T, SourceT, IteratorT, ReverseT> */ js.Any */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ js.Any */](
      CHILD_TAG: () => String,
      TAG: () => String,
      construct: XML => Unit,
      count: js.Any => Double,
      createChild: XML => T,
      get: js.Any => T,
      has: js.Any => Boolean,
      key: () => js.Any,
      toXML: () => XML
    ): IEntityGroup[T, SourceT, IteratorT, ReverseT] = {
      val __obj = js.Dynamic.literal(CHILD_TAG = js.Any.fromFunction0(CHILD_TAG), TAG = js.Any.fromFunction0(TAG), construct = js.Any.fromFunction1(construct), count = js.Any.fromFunction1(count), createChild = js.Any.fromFunction1(createChild), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), key = js.Any.fromFunction0(key), toXML = js.Any.fromFunction0(toXML))
      __obj.asInstanceOf[IEntityGroup[T, SourceT, IteratorT, ReverseT]]
    }
    
    /**
      * @hidden
      */
    @JSImport("samchon/protocol/entity/IEntityGroup", "IEntityGroup.construct")
    @js.native
    def construct[T /* <: IEntity */, SourceT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.Container<T, SourceT, IteratorT, ReverseT> */ js.Any */, IteratorT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.Iterator<T, SourceT, IteratorT, ReverseT> */ js.Any */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ js.Any */](entityGroup: IEntityGroup[T, SourceT, IteratorT, ReverseT], xml: XML, prohibited_names: String*): Unit = js.native
    
    @JSImport("samchon/protocol/entity/IEntityGroup", "IEntityGroup.count")
    @js.native
    def count[T /* <: IEntity */, SourceT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.Container<T, SourceT, IteratorT, ReverseT> */ js.Any */, IteratorT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.Iterator<T, SourceT, IteratorT, ReverseT> */ js.Any */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ js.Any */](entityGroup: IEntityGroup[T, SourceT, IteratorT, ReverseT], key: js.Any): Double = js.native
    
    @JSImport("samchon/protocol/entity/IEntityGroup", "IEntityGroup.get")
    @js.native
    def get[T /* <: IEntity */, SourceT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.Container<T, SourceT, IteratorT, ReverseT> */ js.Any */, IteratorT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.Iterator<T, SourceT, IteratorT, ReverseT> */ js.Any */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ js.Any */](entityGroup: IEntityGroup[T, SourceT, IteratorT, ReverseT], key: js.Any): T = js.native
    
    @JSImport("samchon/protocol/entity/IEntityGroup", "IEntityGroup.has")
    @js.native
    def has[T /* <: IEntity */, SourceT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.Container<T, SourceT, IteratorT, ReverseT> */ js.Any */, IteratorT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.Iterator<T, SourceT, IteratorT, ReverseT> */ js.Any */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ js.Any */](entityGroup: IEntityGroup[T, SourceT, IteratorT, ReverseT], key: js.Any): Boolean = js.native
    
    /**
      * @hidden
      */
    @JSImport("samchon/protocol/entity/IEntityGroup", "IEntityGroup.toXML")
    @js.native
    def toXML[T /* <: IEntity */, SourceT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.Container<T, SourceT, IteratorT, ReverseT> */ js.Any */, IteratorT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.Iterator<T, SourceT, IteratorT, ReverseT> */ js.Any */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ js.Any */](group: IEntityGroup[T, SourceT, IteratorT, ReverseT], prohibited_names: String*): XML = js.native
    
    @scala.inline
    implicit class IEntityGroupMutableBuilder[Self <: IEntityGroup[_, _, _, _], T /* <: IEntity */, SourceT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.Container<T, SourceT, IteratorT, ReverseT> */ js.Any */, IteratorT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.Iterator<T, SourceT, IteratorT, ReverseT> */ js.Any */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ js.Any */] (val x: Self with (IEntityGroup[T, SourceT, IteratorT, ReverseT])) extends AnyVal {
      
      @scala.inline
      def setCHILD_TAG(value: () => String): Self = StObject.set(x, "CHILD_TAG", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCount(value: js.Any => Double): Self = StObject.set(x, "count", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCreateChild(value: XML => T): Self = StObject.set(x, "createChild", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGet(value: js.Any => T): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHas(value: js.Any => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
    }
  }
}
