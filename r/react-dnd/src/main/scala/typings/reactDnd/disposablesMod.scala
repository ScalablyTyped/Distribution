package typings.reactDnd

import typings.reactDnd.anon.Dispose
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object disposablesMod {
  
  @JSImport("react-dnd/lib/decorators/disposables", "CompositeDisposable")
  @js.native
  class CompositeDisposable protected () extends StObject {
    def this(disposables: Disposable*) = this()
    
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
    
    var disposables: js.Any = js.native
    
    /**
      *  Disposes all disposables in the group and removes them from the group.
      */
    def dispose(): Unit = js.native
    
    var isDisposed: js.Any = js.native
    
    /**
      * Removes and disposes the first occurrence of a disposable from the CompositeDisposable.
      * @param {Any} item Disposable to remove.
      * @returns {Boolean} true if found; false otherwise.
      */
    def remove(item: Disposable): Boolean = js.native
  }
  
  @JSImport("react-dnd/lib/decorators/disposables", "Disposable")
  @js.native
  class Disposable protected () extends StObject {
    def this(action: js.Any) = this()
    
    var action: js.Any = js.native
    
    /** Performs the task of cleaning up resources. */
    def dispose(): Unit = js.native
    
    var isDisposed: js.Any = js.native
  }
  /* static members */
  object Disposable {
    
    @JSImport("react-dnd/lib/decorators/disposables", "Disposable")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-dnd/lib/decorators/disposables", "Disposable._fixup")
    @js.native
    def _fixup(result: js.Any): js.Any = js.native
    
    /**
      * Creates a disposable object that invokes the specified action when disposed.
      * @param {Function} dispose Action to run during the first call to dispose.
      * The action is guaranteed to be run at most once.
      * @return {Disposable} The disposable object that runs the given action upon disposal.
      */
    @JSImport("react-dnd/lib/decorators/disposables", "Disposable.create")
    @js.native
    def create(action: js.Any): Disposable = js.native
    
    /**
      * Gets the disposable that does nothing when disposed.
      */
    @JSImport("react-dnd/lib/decorators/disposables", "Disposable.empty")
    @js.native
    def empty: Dispose = js.native
    @scala.inline
    def empty_=(x: Dispose): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("empty")(x.asInstanceOf[js.Any])
    
    /**
      * Validates whether the given object is a disposable
      * @param {Object} Object to test whether it has a dispose method
      * @returns {Boolean} true if a disposable object, else false.
      */
    @JSImport("react-dnd/lib/decorators/disposables", "Disposable.isDisposable")
    @js.native
    def isDisposable(d: js.Any): Boolean = js.native
  }
  
  @JSImport("react-dnd/lib/decorators/disposables", "SerialDisposable")
  @js.native
  class SerialDisposable () extends StObject {
    
    var current: js.Any = js.native
    
    /** Performs the task of cleaning up resources. */
    def dispose(): Unit = js.native
    
    /**
      * Gets the underlying disposable.
      * @returns {Any} the underlying disposable.
      */
    def getDisposable(): js.UndefOr[Disposable] = js.native
    
    var isDisposed: js.Any = js.native
    
    def setDisposable(value: Disposable): Unit = js.native
  }
}
