organization := "org.scalablytyped"
name := "rollup-plugin-delete"
version := "0.2-dt-20190306Z-94242d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "acorn" % "4.0-dt-20190212Z-65c855",
  "org.scalablytyped" %%% "braces" % "2.3-dt-20180214Z-edb918",
  "org.scalablytyped" %%% "del" % "4.0.0-5faff4",
  "org.scalablytyped" %%% "dir-glob" % "2.0-dt-20181212Z-6b9642",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20180417Z-154c1f",
  "org.scalablytyped" %%% "fast-glob" % "2.2.6-69e556",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-288ee1",
  "org.scalablytyped" %%% "glob-parent" % "3.1-dt-20180214Z-ec6929",
  "org.scalablytyped" %%% "glob-to-regexp" % "0.4-dt-20180607Z-9d06cf",
  "org.scalablytyped" %%% "globby" % "9.1.0-14a2d1",
  "org.scalablytyped" %%% "ignore" % "3.3.10-bb014f",
  "org.scalablytyped" %%% "is-glob" % "4.0-dt-20180214Z-399c7b",
  "org.scalablytyped" %%% "is-path-cwd" % "1.0-dt-20180214Z-e451aa",
  "org.scalablytyped" %%% "is-path-in-cwd" % "1.0-dt-20180214Z-b65fce",
  "org.scalablytyped" %%% "merge2" % "1.1-dt-20180214Z-8d8873",
  "org.scalablytyped" %%% "micromatch" % "3.1-dt-20180214Z-3ed78d",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-0a2b2c",
  "org.scalablytyped" %%% "mrmlnc__readdir-enhanced" % "2.2.1-84f869",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190312Z-f6d9fe",
  "org.scalablytyped" %%% "nodelib__fs_dot_stat" % "1.1.3-c86c20",
  "org.scalablytyped" %%% "p-map" % "2.0.0-8063aa",
  "org.scalablytyped" %%% "pify" % "3.0.0-dt-20180501Z-937816",
  "org.scalablytyped" %%% "rimraf" % "2.0-dt-20180214Z-a1c724",
  "org.scalablytyped" %%% "rollup" % "1.6.0-82dbbd",
  "org.scalablytyped" %%% "slash" % "2.0-dt-20181224Z-adddb4",
  "org.scalablytyped" %%% "std" % "3.3-ec2942")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        