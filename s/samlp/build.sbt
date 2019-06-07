organization := "org.scalablytyped"
name := "samlp"
version := "1.0.0-dt-20190322Z-5416df"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-51a501",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-0a8905",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190604Z-e17ce1",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190606Z-1f4573",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-49fefe",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190606Z-b7fe68",
  "org.scalablytyped" %%% "passport" % "1.0-dt-20190524Z-3600cb",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-374f35",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-3a476c",
  "org.scalablytyped" %%% "std" % "3.5-f010ac")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        