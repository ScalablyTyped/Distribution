package typings
package promisedDashLdapLib.promisedDashLdapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Client
  extends nodeLib.eventsMod.EventEmitter {
  def _search(base: java.lang.String, options: ldapjsLib.ldapjsMod.SearchOptions): stdLib.Promise[nodeLib.eventsMod.EventEmitter] = js.native
  def _search(base: java.lang.String, options: ldapjsLib.ldapjsMod.SearchOptions, _bypass: scala.Boolean): stdLib.Promise[nodeLib.eventsMod.EventEmitter] = js.native
  def _search(
    base: java.lang.String,
    options: ldapjsLib.ldapjsMod.SearchOptions,
    controls: js.Array[ldapjsLib.ldapjsMod.Control]
  ): stdLib.Promise[nodeLib.eventsMod.EventEmitter] = js.native
  def _search(
    base: java.lang.String,
    options: ldapjsLib.ldapjsMod.SearchOptions,
    controls: js.Array[ldapjsLib.ldapjsMod.Control],
    _bypass: scala.Boolean
  ): stdLib.Promise[nodeLib.eventsMod.EventEmitter] = js.native
  def _search(
    base: java.lang.String,
    options: ldapjsLib.ldapjsMod.SearchOptions,
    controls: ldapjsLib.ldapjsMod.Control
  ): stdLib.Promise[nodeLib.eventsMod.EventEmitter] = js.native
  def _search(
    base: java.lang.String,
    options: ldapjsLib.ldapjsMod.SearchOptions,
    controls: ldapjsLib.ldapjsMod.Control,
    _bypass: scala.Boolean
  ): stdLib.Promise[nodeLib.eventsMod.EventEmitter] = js.native
  def add(name: java.lang.String, entry: js.Object): stdLib.Promise[_] = js.native
  def add(name: java.lang.String, entry: js.Object, controls: js.Array[ldapjsLib.ldapjsMod.Control]): stdLib.Promise[_] = js.native
  def add(name: java.lang.String, entry: js.Object, controls: ldapjsLib.ldapjsMod.Control): stdLib.Promise[_] = js.native
  def authenticate(base: java.lang.String, dn: java.lang.String, password: java.lang.String): stdLib.Promise[_] = js.native
  def authenticateUser(base: java.lang.String, dn: java.lang.String, password: java.lang.String): stdLib.Promise[promisedDashLdapLib.Anon_Groups | scala.Null] = js.native
  def bind(dn: java.lang.String, password: java.lang.String): stdLib.Promise[_] = js.native
  def bind(dn: java.lang.String, password: java.lang.String, controls: js.Array[ldapjsLib.ldapjsMod.Control]): stdLib.Promise[_] = js.native
  def bind(dn: java.lang.String, password: java.lang.String, controls: ldapjsLib.ldapjsMod.Control): stdLib.Promise[_] = js.native
  def compare(name: java.lang.String, attr: java.lang.String, value: java.lang.String): stdLib.Promise[scala.Boolean] = js.native
  def compare(
    name: java.lang.String,
    attr: java.lang.String,
    value: java.lang.String,
    controls: js.Array[ldapjsLib.ldapjsMod.Control]
  ): stdLib.Promise[scala.Boolean] = js.native
  def compare(
    name: java.lang.String,
    attr: java.lang.String,
    value: java.lang.String,
    controls: ldapjsLib.ldapjsMod.Control
  ): stdLib.Promise[scala.Boolean] = js.native
  def del(name: java.lang.String): stdLib.Promise[_] = js.native
  def del(name: java.lang.String, controls: js.Array[ldapjsLib.ldapjsMod.Control]): stdLib.Promise[_] = js.native
  def del(name: java.lang.String, controls: ldapjsLib.ldapjsMod.Control): stdLib.Promise[_] = js.native
  def destroy(): scala.Unit = js.native
  def destroy(err: js.Any): scala.Unit = js.native
  def exop(name: java.lang.String, value: java.lang.String): stdLib.Promise[_] = js.native
  def exop(name: java.lang.String, value: java.lang.String, controls: js.Array[ldapjsLib.ldapjsMod.Control]): stdLib.Promise[_] = js.native
  def exop(name: java.lang.String, value: java.lang.String, controls: ldapjsLib.ldapjsMod.Control): stdLib.Promise[_] = js.native
  def modify(name: java.lang.String, change: js.Array[ldapjsLib.ldapjsMod.Change]): stdLib.Promise[_] = js.native
  def modify(
    name: java.lang.String,
    change: js.Array[ldapjsLib.ldapjsMod.Change],
    controls: js.Array[ldapjsLib.ldapjsMod.Control]
  ): stdLib.Promise[_] = js.native
  def modify(
    name: java.lang.String,
    change: js.Array[ldapjsLib.ldapjsMod.Change],
    controls: ldapjsLib.ldapjsMod.Control
  ): stdLib.Promise[_] = js.native
  def modify(name: java.lang.String, change: ldapjsLib.ldapjsMod.Change): stdLib.Promise[_] = js.native
  def modify(
    name: java.lang.String,
    change: ldapjsLib.ldapjsMod.Change,
    controls: js.Array[ldapjsLib.ldapjsMod.Control]
  ): stdLib.Promise[_] = js.native
  def modify(name: java.lang.String, change: ldapjsLib.ldapjsMod.Change, controls: ldapjsLib.ldapjsMod.Control): stdLib.Promise[_] = js.native
  def modifyDN(name: java.lang.String, newName: java.lang.String): stdLib.Promise[_] = js.native
  def modifyDN(name: java.lang.String, newName: java.lang.String, controls: js.Array[ldapjsLib.ldapjsMod.Control]): stdLib.Promise[_] = js.native
  def modifyDN(name: java.lang.String, newName: java.lang.String, controls: ldapjsLib.ldapjsMod.Control): stdLib.Promise[_] = js.native
  def search(base: java.lang.String, options: ldapjsLib.ldapjsMod.SearchOptions): stdLib.Promise[promisedDashLdapLib.Anon_References] = js.native
  def search(
    base: java.lang.String,
    options: ldapjsLib.ldapjsMod.SearchOptions,
    controls: js.Array[ldapjsLib.ldapjsMod.Control]
  ): stdLib.Promise[promisedDashLdapLib.Anon_References] = js.native
  def search(
    base: java.lang.String,
    options: ldapjsLib.ldapjsMod.SearchOptions,
    controls: ldapjsLib.ldapjsMod.Control
  ): stdLib.Promise[promisedDashLdapLib.Anon_References] = js.native
  def starttls(options: js.Object, controls: js.Array[ldapjsLib.ldapjsMod.Control]): stdLib.Promise[_] = js.native
  def starttls(options: js.Object, controls: js.Array[ldapjsLib.ldapjsMod.Control], _bypass: scala.Boolean): stdLib.Promise[_] = js.native
  def starttls(options: js.Object, controls: ldapjsLib.ldapjsMod.Control): stdLib.Promise[_] = js.native
  def starttls(options: js.Object, controls: ldapjsLib.ldapjsMod.Control, _bypass: scala.Boolean): stdLib.Promise[_] = js.native
  def unbind(): stdLib.Promise[scala.Unit] = js.native
}

