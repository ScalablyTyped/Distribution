package typings.remixRunWebFormData

import typings.std.Blob
import typings.std.File
import typings.std.FormDataEntryValue
import typings.std.HTMLFormElement
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcFormDataMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.FormData * / any */ @JSImport("@remix-run/web-form-data/dist/src/form-data", "FormData")
  @js.native
  /**
    * @param {HTMLFormElement} [form]
    */
  open class FormData () extends StObject {
    def this(form: HTMLFormElement) = this()
    
    /**
      * @private
      * @readonly
      * @type {Array<[string, FormDataEntryValue]>}
      */
    /* private */ val _entries: Any = js.native
    
    /**
      * Appends a new value onto an existing key inside a FormData object, or adds
      * the key if it does not already exist.
      *
      * The difference between `set` and `append` is that if the specified key
      * already exists, `set` will overwrite all existing values with the new one,
      * whereas `append` will append the new value onto the end of the existing
      * set of values.
      *
      * @param {string} name
      * @param {string|Blob|File} value - The name of the field whose data is
      * contained in value.
      * @param {string} [filename] - The filename reported to the server, when a
      * value is a `Blob` or a `File`. The default filename for a `Blob` objects is
      * `"blob"`. The default filename for a `File` is the it's name.
      */
    def append(name: String): Unit = js.native
    def append(name: String, value: String): Unit = js.native
    def append(name: String, value: String, filename: String): Unit = js.native
    def append(name: String, value: Unit, filename: String): Unit = js.native
    def append(name: String, value: Blob): Unit = js.native
    def append(name: String, value: Blob, filename: String): Unit = js.native
    def append(name: String, value: File): Unit = js.native
    def append(name: String, value: File, filename: String): Unit = js.native
    
    /**
      * Deletes a key and all its values from a FormData object.
      *
      * @param {string} name
      */
    def delete(): Unit = js.native
    def delete(name: String): Unit = js.native
    
    /**
      * Method returns an iterator allowing to go through all key/value pairs
      * contained in this object.
      */
    def entries(): IterableIterator[js.Tuple2[String, FormDataEntryValue]] = js.native
    
    /**
      * @param {(value: FormDataEntryValue, key: string, parent: globalThis.FormData) => void} fn
      * @param {any} [thisArg]
      * @returns {void}
      */
    def forEach(
      fn: js.Function3[
          /* value */ FormDataEntryValue, 
          /* key */ String, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.FormData */ /* parent */ Any, 
          Unit
        ]
    ): Unit = js.native
    def forEach(
      fn: js.Function3[
          /* value */ FormDataEntryValue, 
          /* key */ String, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.FormData */ /* parent */ Any, 
          Unit
        ],
      thisArg: Any
    ): Unit = js.native
    
    /**
      * Returns the first value associated with a given key from within a
      * FormData object.
      *
      * @param {string} name
      * @returns {FormDataEntryValue|null}
      */
    def get(): FormDataEntryValue | Null = js.native
    def get(name: String): FormDataEntryValue | Null = js.native
    
    /**
      * Returns an array of all the values associated with a given key from within
      * a FormData.
      *
      * @param {string} name
      * @returns {FormDataEntryValue[]}
      */
    def getAll(): js.Array[FormDataEntryValue] = js.native
    def getAll(name: String): js.Array[FormDataEntryValue] = js.native
    
    @JSName("get")
    var get_FFormData: Any = js.native
    
    /**
      * Returns a boolean stating whether a FormData object contains a certain key.
      *
      * @param {string} name
      */
    def has(): Boolean = js.native
    def has(name: String): Boolean = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[IterableIterator[js.Tuple2[String, FormDataEntryValue]]] = js.native
    
    /**
      * Returns an iterator allowing to go through all keys of the key/value pairs
      * contained in this object.
      *
      * @returns {IterableIterator<string>}
      */
    def keys(): IterableIterator[String] = js.native
    
    /**
      * Sets a new value for an existing key inside a FormData object, or adds the
      * key/value if it does not already exist.
      *
      * @param {string} name
      * @param {string|Blob|File} value
      * @param {string} [filename]
      */
    def set(name: String): Unit = js.native
    def set(name: String, value: String): Unit = js.native
    def set(name: String, value: String, filename: String): Unit = js.native
    def set(name: String, value: Unit, filename: String): Unit = js.native
    def set(name: String, value: Blob): Unit = js.native
    def set(name: String, value: Blob, filename: String): Unit = js.native
    def set(name: String, value: File): Unit = js.native
    def set(name: String, value: File, filename: String): Unit = js.native
    
    @JSName(js.Symbol.toStringTag)
    var toStringTag: js.Function0[String] = js.native
    
    /**
      * Returns an iterator allowing to go through all values contained in this
      * object.
      *
      * @returns {IterableIterator<FormDataEntryValue>}
      */
    def values(): IterableIterator[FormDataEntryValue] = js.native
  }
}
