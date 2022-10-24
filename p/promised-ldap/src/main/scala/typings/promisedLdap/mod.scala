package typings.promisedLdap

import typings.ldapjs.mod.Change
import typings.ldapjs.mod.Control
import typings.node.eventsMod.EventEmitter
import typings.promisedLdap.anon.Email
import typings.promisedLdap.anon.Entries
import typings.promisedLdap.anon.Url
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("promised-ldap", JSImport.Namespace)
  @js.native
  open class ^ protected () extends Client {
    def this(param0: Url) = this()
  }
  
  @js.native
  trait Client extends EventEmitter {
    
    def _search(base: String, options: typings.ldapjs.mod.SearchOptions): js.Promise[EventEmitter] = js.native
    def _search(base: String, options: typings.ldapjs.mod.SearchOptions, _bypass: Boolean): js.Promise[EventEmitter] = js.native
    def _search(base: String, options: typings.ldapjs.mod.SearchOptions, controls: js.Array[Control]): js.Promise[EventEmitter] = js.native
    def _search(
      base: String,
      options: typings.ldapjs.mod.SearchOptions,
      controls: js.Array[Control],
      _bypass: Boolean
    ): js.Promise[EventEmitter] = js.native
    def _search(base: String, options: typings.ldapjs.mod.SearchOptions, controls: Unit, _bypass: Boolean): js.Promise[EventEmitter] = js.native
    def _search(base: String, options: typings.ldapjs.mod.SearchOptions, controls: Control): js.Promise[EventEmitter] = js.native
    def _search(base: String, options: typings.ldapjs.mod.SearchOptions, controls: Control, _bypass: Boolean): js.Promise[EventEmitter] = js.native
    
    def add(name: String, entry: js.Object): js.Promise[Any] = js.native
    def add(name: String, entry: js.Object, controls: js.Array[Control]): js.Promise[Any] = js.native
    def add(name: String, entry: js.Object, controls: Control): js.Promise[Any] = js.native
    
    def authenticate(base: String, dn: String, password: String): js.Promise[Any] = js.native
    
    def authenticateUser(base: String, dn: String, password: String): js.Promise[Email | Null] = js.native
    
    def bind(dn: String, password: String): js.Promise[Any] = js.native
    def bind(dn: String, password: String, controls: js.Array[Control]): js.Promise[Any] = js.native
    def bind(dn: String, password: String, controls: Control): js.Promise[Any] = js.native
    
    def compare(name: String, attr: String, value: String): js.Promise[Boolean] = js.native
    def compare(name: String, attr: String, value: String, controls: js.Array[Control]): js.Promise[Boolean] = js.native
    def compare(name: String, attr: String, value: String, controls: Control): js.Promise[Boolean] = js.native
    
    def del(name: String): js.Promise[Any] = js.native
    def del(name: String, controls: js.Array[Control]): js.Promise[Any] = js.native
    def del(name: String, controls: Control): js.Promise[Any] = js.native
    
    def destroy(): Unit = js.native
    def destroy(err: Any): Unit = js.native
    
    def exop(name: String, value: String): js.Promise[Any] = js.native
    def exop(name: String, value: String, controls: js.Array[Control]): js.Promise[Any] = js.native
    def exop(name: String, value: String, controls: Control): js.Promise[Any] = js.native
    
    def modify(name: String, change: js.Array[Change]): js.Promise[Any] = js.native
    def modify(name: String, change: js.Array[Change], controls: js.Array[Control]): js.Promise[Any] = js.native
    def modify(name: String, change: js.Array[Change], controls: Control): js.Promise[Any] = js.native
    def modify(name: String, change: Change): js.Promise[Any] = js.native
    def modify(name: String, change: Change, controls: js.Array[Control]): js.Promise[Any] = js.native
    def modify(name: String, change: Change, controls: Control): js.Promise[Any] = js.native
    
    def modifyDN(name: String, newName: String): js.Promise[Any] = js.native
    def modifyDN(name: String, newName: String, controls: js.Array[Control]): js.Promise[Any] = js.native
    def modifyDN(name: String, newName: String, controls: Control): js.Promise[Any] = js.native
    
    def search(base: String, options: typings.ldapjs.mod.SearchOptions): js.Promise[Entries] = js.native
    def search(base: String, options: typings.ldapjs.mod.SearchOptions, controls: js.Array[Control]): js.Promise[Entries] = js.native
    def search(base: String, options: typings.ldapjs.mod.SearchOptions, controls: Control): js.Promise[Entries] = js.native
    
    def starttls(options: js.Object, controls: js.Array[Control]): js.Promise[Any] = js.native
    def starttls(options: js.Object, controls: js.Array[Control], _bypass: Boolean): js.Promise[Any] = js.native
    def starttls(options: js.Object, controls: Control): js.Promise[Any] = js.native
    def starttls(options: js.Object, controls: Control, _bypass: Boolean): js.Promise[Any] = js.native
    
    def unbind(): js.Promise[Unit] = js.native
  }
  
  type SearchOptions = typings.ldapjs.mod.SearchOptions
}
