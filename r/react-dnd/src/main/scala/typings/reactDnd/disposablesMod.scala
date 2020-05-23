package typings.reactDnd

import typings.reactDnd.anon.Dispose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd/lib/decorators/disposables", JSImport.Namespace)
@js.native
object disposablesMod extends js.Object {
  @js.native
  class CompositeDisposable protected () extends js.Object {
    def this(disposables: Disposable*) = this()
    var disposables: js.Any = js.native
    var isDisposed: js.Any = js.native
    /**
      * Adds a disposable to the CompositeDisposable or disposes the disposable if the CompositeDisposable is disposed.
      * @param {Any} item Disposable to add.
      */
    def add(item: Disposable): Unit = js.native
    /**
      *  Disposes all disposables in the group and removes them from the group but
      *  does not dispose the CompositeDisposable.
      */
    def clear(): Unit = js.native
    /**
      *  Disposes all disposables in the group and removes them from the group.
      */
    def dispose(): Unit = js.native
    /**
      * Removes and disposes the first occurrence of a disposable from the CompositeDisposable.
      * @param {Any} item Disposable to remove.
      * @returns {Boolean} true if found; false otherwise.
      */
    def remove(item: Disposable): Boolean = js.native
  }
  
  @js.native
  class Disposable protected () extends js.Object {
    def this(action: js.Any) = this()
    var action: js.Any = js.native
    var isDisposed: js.Any = js.native
    /** Performs the task of cleaning up resources. */
    def dispose(): Unit = js.native
  }
  
  @js.native
  class SerialDisposable () extends js.Object {
    var current: js.Any = js.native
    var isDisposed: js.Any = js.native
    /** Performs the task of cleaning up resources. */
    def dispose(): Unit = js.native
    /**
      * Gets the underlying disposable.
      * @returns {Any} the underlying disposable.
      */
    def getDisposable(): js.UndefOr[Disposable] = js.native
    def setDisposable(value: Disposable): Unit = js.native
  }
  
  /* static members */
  @js.native
  object Disposable extends js.Object {
    /**
      * Gets the disposable that does nothing when disposed.
      */
    var empty: Dispose = js.native
    def _fixup(result: js.Any): js.Any = js.native
    /**
      * Creates a disposable object that invokes the specified action when disposed.
      * @param {Function} dispose Action to run during the first call to dispose.
      * The action is guaranteed to be run at most once.
      * @return {Disposable} The disposable object that runs the given action upon disposal.
      */
    def create(action: js.Any): Disposable = js.native
    /**
      * Validates whether the given object is a disposable
      * @param {Object} Object to test whether it has a dispose method
      * @returns {Boolean} true if a disposable object, else false.
      */
    def isDisposable(d: js.Any): Boolean = js.native
  }
  
}

