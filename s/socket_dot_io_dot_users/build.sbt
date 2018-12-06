organization := "com.scalablytyped"
name := "socket_dot_io_dot_users"
version := "0.0-unknown-dt-20180910Z-3ee061"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "body-parser" % "1.17-dt-20180910Z-6b0d80",
  "com.scalablytyped" %%% "connect" % "v3.4.0-dt-20180910Z-b92a74",
  "com.scalablytyped" %%% "express" % "4.16-dt-20180910Z-b5e732",
  "com.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20180910Z-5d5875",
  "com.scalablytyped" %%% "express-session" % "1.15-dt-20180910Z-3be5b8",
  "com.scalablytyped" %%% "mime" % "2.0-dt-20180910Z-c023cc",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181203Z-7004b3",
  "com.scalablytyped" %%% "range-parser" % "1.2-dt-20180910Z-1bf893",
  "com.scalablytyped" %%% "serve-static" % "1.13-dt-20180910Z-9a9ab6",
  "com.scalablytyped" %%% "socket_dot_io" % "2.1-dt-20181206Z-7e9da8",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        