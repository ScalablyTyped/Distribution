package typings.samchon

import typings.samchon.ientityMod.IEntity
import typings.std.Iterator
import typings.sxml.mod.XML
import typings.tstl.iforwarditeratorMod.IForwardIterator
import typings.tstl.mod.base.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("samchon/protocol/entity/IEntityGroup", JSImport.Namespace)
@js.native
object ientitygroupMod extends js.Object {
  
  @js.native
  trait IEntityGroup[T /* <: IEntity */, SourceT /* <: Container[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: Iterator[T, SourceT, IteratorT] */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ js.Any */]
    extends typings.tstl.containerContainerMod.Container[T, SourceT, IteratorT, ReverseT, T]
       with IEntity {
    
    /**
      * A tag name of children objects.
      */
    def CHILD_TAG(): String = js.native
    
    /**
      * Range Assigner.
      *
      * @param first Input iteartor of the first position.
      * @param last Input iterator of the last position.
      */
    /* InferMemberOverrides */
    override def assign[InputIterator /* <: IForwardIterator[T, InputIterator] */](first: InputIterator, last: InputIterator): Unit = js.native
    
    /**
      * @inheritDoc
      */
    /* InferMemberOverrides */
    override def clear(): Unit = js.native
    
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
      * Erase elements in range.
      *
      * @param first Range of the first position to erase.
      * @param last Rangee of the last position to erase.
      * @return Iterator following the last removed element, strained by the erasing.
      */
    /* InferMemberOverrides */
    override def erase(first: IteratorT, last: IteratorT): IteratorT = js.native
    /**
      * Erase an element.
      *
      * @param pos Position to erase.
      * @return Iterator following the *pos*, strained by the erasing.
      */
    /* InferMemberOverrides */
    override def erase(pos: IteratorT): IteratorT = js.native
    
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
    
    /**
      * Swap elements.
      *
      * @param obj Target container to swap.
      */
    /* InferMemberOverrides */
    override def swap(obj: SourceT): Unit = js.native
    
    /**
      * Native function for `JSON.stringify()`.
      *
      * @return An array containing children elements.
      */
    /* InferMemberOverrides */
    override def toJSON(): js.Array[T] = js.native
  }
  @js.native
  object IEntityGroup extends js.Object {
    
    /**
      * @hidden
      */
    def construct[T /* <: IEntity */, SourceT /* <: Container[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: Iterator[T, SourceT, IteratorT] */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ js.Any */](entityGroup: IEntityGroup[T, SourceT, IteratorT, ReverseT], xml: XML, prohibited_names: String*): Unit = js.native
    
    def count[T /* <: IEntity */, SourceT /* <: Container[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: Iterator[T, SourceT, IteratorT] */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ js.Any */](entityGroup: IEntityGroup[T, SourceT, IteratorT, ReverseT], key: js.Any): Double = js.native
    
    def get[T /* <: IEntity */, SourceT /* <: Container[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: Iterator[T, SourceT, IteratorT] */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ js.Any */](entityGroup: IEntityGroup[T, SourceT, IteratorT, ReverseT], key: js.Any): T = js.native
    
    def has[T /* <: IEntity */, SourceT /* <: Container[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: Iterator[T, SourceT, IteratorT] */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ js.Any */](entityGroup: IEntityGroup[T, SourceT, IteratorT, ReverseT], key: js.Any): Boolean = js.native
    
    /**
      * @hidden
      */
    def toXML[T /* <: IEntity */, SourceT /* <: Container[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: Iterator[T, SourceT, IteratorT] */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ js.Any */](group: IEntityGroup[T, SourceT, IteratorT, ReverseT], prohibited_names: String*): XML = js.native
  }
}
