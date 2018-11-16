package typings
package qiniuLib.qiniuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("qiniu", "form_up")
@js.native
object formUnderscoreUpNs extends js.Object {
  @js.native
  class FormUploader () extends js.Object {
    def this(config: qiniuLib.qiniuMod.confNs.Config) = this()
    var conf: qiniuLib.qiniuMod.confNs.Config = js.native
    /**
             *
             * @param uploadToken
             * @param key
             * @param body
             * @param putExtra
             * @param callback
             */
    def put(
      uploadToken: java.lang.String,
      key: java.lang.String,
      body: js.Any,
      putExtra: PutExtra,
      callback: qiniuLib.qiniuMod.callback
    ): scala.Unit = js.native
    /**
             *
             * @param uploadToken
             * @param key
             * @param body
             * @param putExtra
             * @param callback
             */
    def put(
      uploadToken: java.lang.String,
      key: java.lang.String,
      body: js.Any,
      putExtra: scala.Null,
      callback: qiniuLib.qiniuMod.callback
    ): scala.Unit = js.native
    /**
             *
             * @param uploadToken
             * @param key
             * @param body
             * @param putExtra
             * @param callback
             */
    def put(
      uploadToken: java.lang.String,
      key: scala.Null,
      body: js.Any,
      putExtra: PutExtra,
      callback: qiniuLib.qiniuMod.callback
    ): scala.Unit = js.native
    /**
             *
             * @param uploadToken
             * @param key
             * @param body
             * @param putExtra
             * @param callback
             */
    def put(
      uploadToken: java.lang.String,
      key: scala.Null,
      body: js.Any,
      putExtra: scala.Null,
      callback: qiniuLib.qiniuMod.callback
    ): scala.Unit = js.native
    /**
             * 上传本地文件
             * @param uploadToken 上传凭证
             * @param key 目标文件名
             * @param localFile 本地文件路径
             * @param putExtra 额外选项
             * @param callback
             */
    def putFile(
      uploadToken: java.lang.String,
      key: java.lang.String,
      localFile: java.lang.String,
      putExtra: PutExtra,
      callback: qiniuLib.qiniuMod.callback
    ): scala.Unit = js.native
    /**
             * 上传本地文件
             * @param uploadToken 上传凭证
             * @param key 目标文件名
             * @param localFile 本地文件路径
             * @param putExtra 额外选项
             * @param callback
             */
    def putFile(
      uploadToken: java.lang.String,
      key: java.lang.String,
      localFile: java.lang.String,
      putExtra: scala.Null,
      callback: qiniuLib.qiniuMod.callback
    ): scala.Unit = js.native
    /**
             * 上传本地文件
             * @param uploadToken 上传凭证
             * @param key 目标文件名
             * @param localFile 本地文件路径
             * @param putExtra 额外选项
             * @param callback
             */
    def putFile(
      uploadToken: java.lang.String,
      key: scala.Null,
      localFile: java.lang.String,
      putExtra: PutExtra,
      callback: qiniuLib.qiniuMod.callback
    ): scala.Unit = js.native
    /**
             * 上传本地文件
             * @param uploadToken 上传凭证
             * @param key 目标文件名
             * @param localFile 本地文件路径
             * @param putExtra 额外选项
             * @param callback
             */
    def putFile(
      uploadToken: java.lang.String,
      key: scala.Null,
      localFile: java.lang.String,
      putExtra: scala.Null,
      callback: qiniuLib.qiniuMod.callback
    ): scala.Unit = js.native
    /**
             *
             * @param uploadToken
             * @param localFile
             * @param putExtra
             * @param callback
             */
    def putFileWithoutKey(
      uploadToken: java.lang.String,
      localFile: java.lang.String,
      putExtra: PutExtra,
      callback: qiniuLib.qiniuMod.callback
    ): scala.Unit = js.native
    /**
             *
             * @param uploadToken
             * @param localFile
             * @param putExtra
             * @param callback
             */
    def putFileWithoutKey(
      uploadToken: java.lang.String,
      localFile: java.lang.String,
      putExtra: scala.Null,
      callback: qiniuLib.qiniuMod.callback
    ): scala.Unit = js.native
    /**
             *
             * @param uploadToken
             * @param key
             * @param rsStream
             * @param putExtra
             * @param callback
             */
    def putStream(
      uploadToken: java.lang.String,
      key: java.lang.String,
      rsStream: nodeLib.NodeJSNs.ReadableStream,
      putExtra: PutExtra,
      callback: qiniuLib.qiniuMod.callback
    ): scala.Unit = js.native
    /**
             *
             * @param uploadToken
             * @param key
             * @param rsStream
             * @param putExtra
             * @param callback
             */
    def putStream(
      uploadToken: java.lang.String,
      key: java.lang.String,
      rsStream: nodeLib.NodeJSNs.ReadableStream,
      putExtra: scala.Null,
      callback: qiniuLib.qiniuMod.callback
    ): scala.Unit = js.native
    /**
             *
             * @param uploadToken
             * @param key
             * @param rsStream
             * @param putExtra
             * @param callback
             */
    def putStream(
      uploadToken: java.lang.String,
      key: scala.Null,
      rsStream: nodeLib.NodeJSNs.ReadableStream,
      putExtra: PutExtra,
      callback: qiniuLib.qiniuMod.callback
    ): scala.Unit = js.native
    /**
             *
             * @param uploadToken
             * @param key
             * @param rsStream
             * @param putExtra
             * @param callback
             */
    def putStream(
      uploadToken: java.lang.String,
      key: scala.Null,
      rsStream: nodeLib.NodeJSNs.ReadableStream,
      putExtra: scala.Null,
      callback: qiniuLib.qiniuMod.callback
    ): scala.Unit = js.native
    /**
             *
             * @param uploadToken
             * @param body
             * @param putExtra
             * @param callback
             */
    def putWithoutKey(
      uploadToken: java.lang.String,
      body: js.Any,
      putExtra: PutExtra,
      callback: qiniuLib.qiniuMod.callback
    ): scala.Unit = js.native
    /**
             *
             * @param uploadToken
             * @param body
             * @param putExtra
             * @param callback
             */
    def putWithoutKey(
      uploadToken: java.lang.String,
      body: js.Any,
      putExtra: scala.Null,
      callback: qiniuLib.qiniuMod.callback
    ): scala.Unit = js.native
  }
  
  @js.native
  class PutExtra () extends js.Object {
    /**
             * 上传可选参数
             * @param fname 请求体中的文件的名称
             * @param params 额外参数设置，参数名称必须以x:开头
             * @param mimeType 指定文件的mimeType
             * @param crc32 指定文件的crc32值
             * @param checkCrc 指定是否检测文件的crc32值
             */
    def this(fname: java.lang.String) = this()
    /**
             * 上传可选参数
             * @param fname 请求体中的文件的名称
             * @param params 额外参数设置，参数名称必须以x:开头
             * @param mimeType 指定文件的mimeType
             * @param crc32 指定文件的crc32值
             * @param checkCrc 指定是否检测文件的crc32值
             */
    def this(fname: java.lang.String, params: js.Any) = this()
    /**
             * 上传可选参数
             * @param fname 请求体中的文件的名称
             * @param params 额外参数设置，参数名称必须以x:开头
             * @param mimeType 指定文件的mimeType
             * @param crc32 指定文件的crc32值
             * @param checkCrc 指定是否检测文件的crc32值
             */
    def this(fname: java.lang.String, params: js.Any, mimeType: java.lang.String) = this()
    /**
             * 上传可选参数
             * @param fname 请求体中的文件的名称
             * @param params 额外参数设置，参数名称必须以x:开头
             * @param mimeType 指定文件的mimeType
             * @param crc32 指定文件的crc32值
             * @param checkCrc 指定是否检测文件的crc32值
             */
    def this(fname: java.lang.String, params: js.Any, mimeType: java.lang.String, crc32: java.lang.String) = this()
    /**
             * 上传可选参数
             * @param fname 请求体中的文件的名称
             * @param params 额外参数设置，参数名称必须以x:开头
             * @param mimeType 指定文件的mimeType
             * @param crc32 指定文件的crc32值
             * @param checkCrc 指定是否检测文件的crc32值
             */
    def this(fname: java.lang.String, params: js.Any, mimeType: java.lang.String, crc32: java.lang.String, checkCrc: scala.Boolean) = this()
    /**
             * 上传可选参数
             * @param fname 请求体中的文件的名称
             * @param params 额外参数设置，参数名称必须以x:开头
             * @param mimeType 指定文件的mimeType
             * @param crc32 指定文件的crc32值
             * @param checkCrc 指定是否检测文件的crc32值
             */
    def this(fname: java.lang.String, params: js.Any, mimeType: java.lang.String, crc32: java.lang.String, checkCrc: scala.Double) = this()
    /**
             * @default 0|false
             */
    var checkCrc: js.UndefOr[scala.Double | scala.Boolean] = js.native
    /**
             * @default null
             */
    var crc32: js.UndefOr[java.lang.String] = js.native
    /**
             * @default ''
             */
    var fname: java.lang.String = js.native
    /**
             * @default null
             */
    var mimeType: js.UndefOr[java.lang.String] = js.native
    /**
             * @default {}
             */
    var params: js.Any = js.native
  }
  
}

