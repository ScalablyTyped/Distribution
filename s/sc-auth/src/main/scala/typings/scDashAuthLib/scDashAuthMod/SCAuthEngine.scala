package typings
package scDashAuthLib.scDashAuthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SCAuthEngine extends js.Object {
  def signToken(token: java.lang.String, key: jsonwebtokenLib.jsonwebtokenMod.Secret): scala.Unit = js.native
  def signToken(
    token: java.lang.String,
    key: jsonwebtokenLib.jsonwebtokenMod.Secret,
    options: jsonwebtokenLib.jsonwebtokenMod.SignOptions
  ): scala.Unit = js.native
  def signToken(
    token: java.lang.String,
    key: jsonwebtokenLib.jsonwebtokenMod.Secret,
    options: jsonwebtokenLib.jsonwebtokenMod.SignOptions,
    callback: jsonwebtokenLib.jsonwebtokenMod.SignCallback
  ): scala.Unit = js.native
  def signToken(token: js.Object, key: jsonwebtokenLib.jsonwebtokenMod.Secret): scala.Unit = js.native
  def signToken(
    token: js.Object,
    key: jsonwebtokenLib.jsonwebtokenMod.Secret,
    options: jsonwebtokenLib.jsonwebtokenMod.SignOptions
  ): scala.Unit = js.native
  def signToken(
    token: js.Object,
    key: jsonwebtokenLib.jsonwebtokenMod.Secret,
    options: jsonwebtokenLib.jsonwebtokenMod.SignOptions,
    callback: jsonwebtokenLib.jsonwebtokenMod.SignCallback
  ): scala.Unit = js.native
  def signToken(token: nodeLib.Buffer, key: jsonwebtokenLib.jsonwebtokenMod.Secret): scala.Unit = js.native
  def signToken(
    token: nodeLib.Buffer,
    key: jsonwebtokenLib.jsonwebtokenMod.Secret,
    options: jsonwebtokenLib.jsonwebtokenMod.SignOptions
  ): scala.Unit = js.native
  def signToken(
    token: nodeLib.Buffer,
    key: jsonwebtokenLib.jsonwebtokenMod.Secret,
    options: jsonwebtokenLib.jsonwebtokenMod.SignOptions,
    callback: jsonwebtokenLib.jsonwebtokenMod.SignCallback
  ): scala.Unit = js.native
  def verifyToken(signedToken: java.lang.String, key: java.lang.String): scala.Unit = js.native
  def verifyToken(
    signedToken: java.lang.String,
    key: java.lang.String,
    options: jsonwebtokenLib.jsonwebtokenMod.VerifyOptions
  ): scala.Unit = js.native
  def verifyToken(
    signedToken: java.lang.String,
    key: java.lang.String,
    options: jsonwebtokenLib.jsonwebtokenMod.VerifyOptions,
    callback: jsonwebtokenLib.jsonwebtokenMod.VerifyCallback
  ): scala.Unit = js.native
  def verifyToken(signedToken: java.lang.String, key: nodeLib.Buffer): scala.Unit = js.native
  def verifyToken(
    signedToken: java.lang.String,
    key: nodeLib.Buffer,
    options: jsonwebtokenLib.jsonwebtokenMod.VerifyOptions
  ): scala.Unit = js.native
  def verifyToken(
    signedToken: java.lang.String,
    key: nodeLib.Buffer,
    options: jsonwebtokenLib.jsonwebtokenMod.VerifyOptions,
    callback: jsonwebtokenLib.jsonwebtokenMod.VerifyCallback
  ): scala.Unit = js.native
}

