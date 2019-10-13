package typings.samchon

import typings.samchon.protocolEntityIEntityGroupMod.IEntityGroup
import typings.samchon.protocolEntityIEntityMod.IEntity
import typings.sxml.sxmlMod.XML
import typings.tstl.baseIteratorIteratorMod.Iterator
import typings.tstl.tstlMod.base.Container
import typings.tstl.tstlMod.base.ReverseIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/protocol/entity/IEntityGroup", JSImport.Namespace)
@js.native
object protocolEntityIEntityGroupMod extends js.Object {
  @js.native
  trait IEntityGroup[T /* <: IEntity */, SourceT /* <: Container[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: Iterator[T, SourceT, IteratorT, ReverseT, T] */, ReverseT /* <: ReverseIterator[T, SourceT, IteratorT, ReverseT, T] */]
    extends typings.tstl.baseContainerContainerMod.Container[T, SourceT, IteratorT, ReverseT, T]
       with IEntity {
    /**
      * A tag name of children objects.
      */
    def CHILD_TAG(): String = js.native
    /**
      * Iterator to the first element.
      *
      * @return Iterator to the first element.
      */
    /* InferMemberOverrides */
    override def begin(): Iterator[T, SourceT, IteratorT, ReverseT, T] = js.native
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
      * Test whether container is empty.
      */
    /* CompleteClass */
    /* InferMemberOverrides */
    override def empty(): Boolean = js.native
    /**
      * Iterator to the end.
      *
      * @return Iterator to the end.
      */
    /* InferMemberOverrides */
    override def end(): Iterator[T, SourceT, IteratorT, ReverseT, T] = js.native
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
      * Insert items at the end.
      *
      * @param items Items to insert.
      * @return Number of elements in the container after insertion.
      */
    /* InferMemberOverrides */
    override def push(items: T*): Double = js.native
    /**
      * Reverse iterator to the first element in reverse.
      *
      * @return Reverse iterator to the first.
      */
    /* InferMemberOverrides */
    override def rbegin(): ReverseT = js.native
    /**
      * Reverse iterator to the reverse end.
      *
      * @return Reverse iterator to the end.
      */
    /* InferMemberOverrides */
    override def rend(): ReverseT = js.native
    /**
      * Number of elements in the container.
      */
    /* InferMemberOverrides */
    override def size(): Double = js.native
  }
  
  @js.native
  object IEntityGroup extends js.Object {
    /**
      * @hidden
      */
    def construct[T /* <: IEntity */, SourceT /* <: Container[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: Iterator[T, SourceT, IteratorT, ReverseT, T] */, ReverseT /* <: ReverseIterator[T, SourceT, IteratorT, ReverseT, T] */](entityGroup: IEntityGroup[T, SourceT, IteratorT, ReverseT], xml: XML, prohibited_names: String*): Unit = js.native
    def count[T /* <: IEntity */, SourceT /* <: Container[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: Iterator[T, SourceT, IteratorT, ReverseT, T] */, ReverseT /* <: ReverseIterator[T, SourceT, IteratorT, ReverseT, T] */](entityGroup: IEntityGroup[T, SourceT, IteratorT, ReverseT], key: js.Any): Double = js.native
    def get[T /* <: IEntity */, SourceT /* <: Container[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: Iterator[T, SourceT, IteratorT, ReverseT, T] */, ReverseT /* <: ReverseIterator[T, SourceT, IteratorT, ReverseT, T] */](entityGroup: IEntityGroup[T, SourceT, IteratorT, ReverseT], key: js.Any): T = js.native
    def has[T /* <: IEntity */, SourceT /* <: Container[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: Iterator[T, SourceT, IteratorT, ReverseT, T] */, ReverseT /* <: ReverseIterator[T, SourceT, IteratorT, ReverseT, T] */](entityGroup: IEntityGroup[T, SourceT, IteratorT, ReverseT], key: js.Any): Boolean = js.native
    /**
      * @hidden
      */
    def toXML[T /* <: IEntity */, SourceT /* <: Container[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: Iterator[T, SourceT, IteratorT, ReverseT, T] */, ReverseT /* <: ReverseIterator[T, SourceT, IteratorT, ReverseT, T] */](group: IEntityGroup[T, SourceT, IteratorT, ReverseT], prohibited_names: String*): XML = js.native
  }
  
}

