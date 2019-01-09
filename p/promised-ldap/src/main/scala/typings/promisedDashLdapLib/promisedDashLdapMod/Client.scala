package typings
package promisedDashLdapLib.promisedDashLdapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Client
  extends nodeLib.eventsMod.EventEmitter {
  def _search(base: java.lang.String, options: ldapjsLib.ldapjsMod.SearchOptions): js.Promise[nodeLib.eventsMod.EventEmitter] = js.native
  def _search(base: java.lang.String, options: ldapjsLib.ldapjsMod.SearchOptions, _bypass: scala.Boolean): js.Promise[nodeLib.eventsMod.EventEmitter] = js.native
  def _search(
    base: java.lang.String,
    options: ldapjsLib.ldapjsMod.SearchOptions,
    controls: js.Array[ldapjsLib.ldapjsMod.Control]
  ): js.Promise[nodeLib.eventsMod.EventEmitter] = js.native
  def _search(
    base: java.lang.String,
    options: ldapjsLib.ldapjsMod.SearchOptions,
    controls: js.Array[ldapjsLib.ldapjsMod.Control],
    _bypass: scala.Boolean
  ): js.Promise[nodeLib.eventsMod.EventEmitter] = js.native
  def _search(
    base: java.lang.String,
    options: ldapjsLib.ldapjsMod.SearchOptions,
    controls: ldapjsLib.ldapjsMod.Control
  ): js.Promise[nodeLib.eventsMod.EventEmitter] = js.native
  def _search(
    base: java.lang.String,
    options: ldapjsLib.ldapjsMod.SearchOptions,
    controls: ldapjsLib.ldapjsMod.Control,
    _bypass: scala.Boolean
  ): js.Promise[nodeLib.eventsMod.EventEmitter] = js.native
  def add(name: java.lang.String, entry: js.Object): js.Promise[_] = js.native
  def add(name: java.lang.String, entry: js.Object, controls: js.Array[ldapjsLib.ldapjsMod.Control]): js.Promise[_] = js.native
  def add(name: java.lang.String, entry: js.Object, controls: ldapjsLib.ldapjsMod.Control): js.Promise[_] = js.native
  def authenticate(base: java.lang.String, dn: java.lang.String, password: java.lang.String): js.Promise[_] = js.native
  def authenticateUser(base: java.lang.String, dn: java.lang.String, password: java.lang.String): js.Promise[promisedDashLdapLib.Anon_Email | scala.Null] = js.native
  def bind(dn: java.lang.String, password: java.lang.String): js.Promise[_] = js.native
  def bind(dn: java.lang.String, password: java.lang.String, controls: js.Array[ldapjsLib.ldapjsMod.Control]): js.Promise[_] = js.native
  def bind(dn: java.lang.String, password: java.lang.String, controls: ldapjsLib.ldapjsMod.Control): js.Promise[_] = js.native
  def compare(name: java.lang.String, attr: java.lang.String, value: java.lang.String): js.Promise[scala.Boolean] = js.native
  def compare(
    name: java.lang.String,
    attr: java.lang.String,
    value: java.lang.String,
    controls: js.Array[ldapjsLib.ldapjsMod.Control]
  ): js.Promise[scala.Boolean] = js.native
  def compare(
    name: java.lang.String,
    attr: java.lang.String,
    value: java.lang.String,
    controls: ldapjsLib.ldapjsMod.Control
  ): js.Promise[scala.Boolean] = js.native
  def del(name: java.lang.String): js.Promise[_] = js.native
  def del(name: java.lang.String, controls: js.Array[ldapjsLib.ldapjsMod.Control]): js.Promise[_] = js.native
  def del(name: java.lang.String, controls: ldapjsLib.ldapjsMod.Control): js.Promise[_] = js.native
  def destroy(): scala.Unit = js.native
  def destroy(err: js.Any): scala.Unit = js.native
  def exop(name: java.lang.String, value: java.lang.String): js.Promise[_] = js.native
  def exop(name: java.lang.String, value: java.lang.String, controls: js.Array[ldapjsLib.ldapjsMod.Control]): js.Promise[_] = js.native
  def exop(name: java.lang.String, value: java.lang.String, controls: ldapjsLib.ldapjsMod.Control): js.Promise[_] = js.native
  def modify(name: java.lang.String, change: js.Array[ldapjsLib.ldapjsMod.Change]): js.Promise[_] = js.native
  def modify(
    name: java.lang.String,
    change: js.Array[ldapjsLib.ldapjsMod.Change],
    controls: js.Array[ldapjsLib.ldapjsMod.Control]
  ): js.Promise[_] = js.native
  def modify(
    name: java.lang.String,
    change: js.Array[ldapjsLib.ldapjsMod.Change],
    controls: ldapjsLib.ldapjsMod.Control
  ): js.Promise[_] = js.native
  def modify(name: java.lang.String, change: ldapjsLib.ldapjsMod.Change): js.Promise[_] = js.native
  def modify(
    name: java.lang.String,
    change: ldapjsLib.ldapjsMod.Change,
    controls: js.Array[ldapjsLib.ldapjsMod.Control]
  ): js.Promise[_] = js.native
  def modify(name: java.lang.String, change: ldapjsLib.ldapjsMod.Change, controls: ldapjsLib.ldapjsMod.Control): js.Promise[_] = js.native
  def modifyDN(name: java.lang.String, newName: java.lang.String): js.Promise[_] = js.native
  def modifyDN(name: java.lang.String, newName: java.lang.String, controls: js.Array[ldapjsLib.ldapjsMod.Control]): js.Promise[_] = js.native
  def modifyDN(name: java.lang.String, newName: java.lang.String, controls: ldapjsLib.ldapjsMod.Control): js.Promise[_] = js.native
  def search(base: java.lang.String, options: ldapjsLib.ldapjsMod.SearchOptions): js.Promise[promisedDashLdapLib.Anon_Entries] = js.native
  def search(
    base: java.lang.String,
    options: ldapjsLib.ldapjsMod.SearchOptions,
    controls: js.Array[ldapjsLib.ldapjsMod.Control]
  ): js.Promise[promisedDashLdapLib.Anon_Entries] = js.native
  def search(
    base: java.lang.String,
    options: ldapjsLib.ldapjsMod.SearchOptions,
    controls: ldapjsLib.ldapjsMod.Control
  ): js.Promise[promisedDashLdapLib.Anon_Entries] = js.native
  def starttls(options: js.Object, controls: js.Array[ldapjsLib.ldapjsMod.Control]): js.Promise[_] = js.native
  def starttls(options: js.Object, controls: js.Array[ldapjsLib.ldapjsMod.Control], _bypass: scala.Boolean): js.Promise[_] = js.native
  def starttls(options: js.Object, controls: ldapjsLib.ldapjsMod.Control): js.Promise[_] = js.native
  def starttls(options: js.Object, controls: ldapjsLib.ldapjsMod.Control, _bypass: scala.Boolean): js.Promise[_] = js.native
  def unbind(): js.Promise[scala.Unit] = js.native
}

