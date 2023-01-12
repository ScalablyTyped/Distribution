package typings.samchon

import typings.samchon.protocolEntityIentityMod.IEntity
import typings.sxml.mod.XML
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object protocolEntityIentitygroupMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.Container<T, SourceT, IteratorT, ReverseT> * / any */ trait IEntityGroup[T /* <: IEntity */, SourceT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.Container<T, SourceT, IteratorT, ReverseT> */ Any */, IteratorT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.Iterator<T, SourceT, IteratorT, ReverseT> */ Any */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ Any */]
    extends StObject
       with IEntity {
    
    /**
      * A tag name of children objects.
      */
    def CHILD_TAG(): String
    
    /**
      * Count elements with a specific key.
      *
      * Searches the container for elements whose key is *key* and returns the number of elements found.
      *
      * @param key Key value to be searched for.
      *
      * @return The number of elements in the container with a *key*.
      */
    def count(key: Any): Double
    
    /**
      * Factory method of a child Entity.
      *
      * EntityArray::createChild() is a factory method creating a new child Entity which is belonged
      * to the EntityArray. This method is called by EntityArray::construct(). The children construction
      * methods Entity::construct() will be called by abstract method of the EntityArray::construct().
      *
      * @return A new child Entity belongs to EntityArray.
      */
    def createChild(xml: XML): T
    
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
    def get(key: Any): T
    
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
    def has(key: Any): Boolean
  }
  object IEntityGroup {
    
    inline def apply[T /* <: IEntity */, SourceT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.Container<T, SourceT, IteratorT, ReverseT> */ Any */, IteratorT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.Iterator<T, SourceT, IteratorT, ReverseT> */ Any */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ Any */](
      CHILD_TAG: () => String,
      TAG: () => String,
      construct: XML => Unit,
      count: Any => Double,
      createChild: XML => T,
      get: Any => T,
      has: Any => Boolean,
      key: () => Any,
      toXML: () => XML
    ): IEntityGroup[T, SourceT, IteratorT, ReverseT] = {
      val __obj = js.Dynamic.literal(CHILD_TAG = js.Any.fromFunction0(CHILD_TAG), TAG = js.Any.fromFunction0(TAG), construct = js.Any.fromFunction1(construct), count = js.Any.fromFunction1(count), createChild = js.Any.fromFunction1(createChild), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), key = js.Any.fromFunction0(key), toXML = js.Any.fromFunction0(toXML))
      __obj.asInstanceOf[IEntityGroup[T, SourceT, IteratorT, ReverseT]]
    }
    
    @JSImport("samchon/protocol/entity/IEntityGroup", "IEntityGroup")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @hidden
      */
    inline def construct[T /* <: IEntity */, SourceT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.Container<T, SourceT, IteratorT, ReverseT> */ Any */, IteratorT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.Iterator<T, SourceT, IteratorT, ReverseT> */ Any */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ Any */](entityGroup: IEntityGroup[T, SourceT, IteratorT, ReverseT], xml: XML, prohibited_names: String*): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("construct")((scala.List(entityGroup.asInstanceOf[js.Any], xml.asInstanceOf[js.Any])).`++`(prohibited_names.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Unit]
    
    inline def count[T /* <: IEntity */, SourceT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.Container<T, SourceT, IteratorT, ReverseT> */ Any */, IteratorT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.Iterator<T, SourceT, IteratorT, ReverseT> */ Any */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ Any */](entityGroup: IEntityGroup[T, SourceT, IteratorT, ReverseT], key: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("count")(entityGroup.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def get[T /* <: IEntity */, SourceT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.Container<T, SourceT, IteratorT, ReverseT> */ Any */, IteratorT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.Iterator<T, SourceT, IteratorT, ReverseT> */ Any */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ Any */](entityGroup: IEntityGroup[T, SourceT, IteratorT, ReverseT], key: Any): T = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(entityGroup.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[T]
    
    inline def has[T /* <: IEntity */, SourceT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.Container<T, SourceT, IteratorT, ReverseT> */ Any */, IteratorT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.Iterator<T, SourceT, IteratorT, ReverseT> */ Any */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ Any */](entityGroup: IEntityGroup[T, SourceT, IteratorT, ReverseT], key: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("has")(entityGroup.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * @hidden
      */
    inline def toXML[T /* <: IEntity */, SourceT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.Container<T, SourceT, IteratorT, ReverseT> */ Any */, IteratorT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.Iterator<T, SourceT, IteratorT, ReverseT> */ Any */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ Any */](group: IEntityGroup[T, SourceT, IteratorT, ReverseT], prohibited_names: String*): XML = ^.asInstanceOf[js.Dynamic].applyDynamic("toXML")(scala.List(group.asInstanceOf[js.Any]).`++`(prohibited_names.asInstanceOf[Seq[js.Any]])*).asInstanceOf[XML]
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IEntityGroup[?, ?, ?, ?], T /* <: IEntity */, SourceT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.Container<T, SourceT, IteratorT, ReverseT> */ Any */, IteratorT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.Iterator<T, SourceT, IteratorT, ReverseT> */ Any */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ Any */] (val x: Self & (IEntityGroup[T, SourceT, IteratorT, ReverseT])) extends AnyVal {
      
      inline def setCHILD_TAG(value: () => String): Self = StObject.set(x, "CHILD_TAG", js.Any.fromFunction0(value))
      
      inline def setCount(value: Any => Double): Self = StObject.set(x, "count", js.Any.fromFunction1(value))
      
      inline def setCreateChild(value: XML => T): Self = StObject.set(x, "createChild", js.Any.fromFunction1(value))
      
      inline def setGet(value: Any => T): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setHas(value: Any => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
    }
  }
}
