organization := "org.scalablytyped"
name := "socket_dot_io_dot_users"
version := "0.0-unknown-dt-20191014Z-d81e8a"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-a86019",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-337a2e",
  "org.scalablytyped" %%% "express" % "4.17-dt-20191101Z-ce8d0e",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20191115Z-f0de5e",
  "org.scalablytyped" %%% "express-session" % "1.15-dt-20191017Z-d7c7d2",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-301fe0",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191115Z-3b62fb",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-6ebcbf",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-ac1781",
  "org.scalablytyped" %%% "socket_dot_io" % "2.1-dt-20191008Z-2b3093",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        